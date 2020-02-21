package com.powermock.stat;

import com.powermock.manual.manual.test.Company;
import com.powermock.manual.manual.test.User;
import com.powermock.manual.manual.test.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UserService.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private Company company;

    @Mock
    private User user;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private static final String METHOD = "savePrefrence";

    @Test
    public void testSavePrefrences() throws Exception {
        UserService spyuserService = PowerMockito.spy(userService);

        user.setCompanyId(123456);
        user.setUserId(4411);
        user.setName("Power Mock is headache for developers");
        List<User> uList = new ArrayList<User>();
        uList.add(user);

        company.setUserId(user.getCompanyId());
        company.setUserId(user.getUserId());

        when(spyuserService, METHOD, Matchers.anyLong(), Matchers.anyLong(), Matchers.anyList()).thenReturn(company);

//        verifyPrivate(spyuserService);
        Assert.assertNotNull(spyuserService);
        Assert.assertEquals(user.getCompanyId(), company.getCompanyId());
        verifyPrivate(spyuserService, Mockito.times(1)).invoke(METHOD, Matchers.anyLong(), Matchers.anyLong(), Matchers.anyList());
    }

    @Test
    public void testStaticMethod() {

        PowerMockito.mockStatic(UserService.class);
        String expected = "Good its working absolutely fine";
        when(UserService.callStaticMethod()).thenReturn(expected);
        String actual = UserService.callStaticMethod();

        verifyStatic();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testPrivateStaticMethod() throws Exception {
        UserService spyObject = spy(userService);
        mockStatic(UserService.class);
        int actual = 1990;
        when(spyObject, "privateStaticMethod", actual).thenReturn(1990);
        Assert.assertEquals(1990, actual);
        verifyPrivate(spyObject, Mockito.times(1)).invoke("privateStaticMethod", actual);
    }
}


