package com.powermock.priv.method;

import com.powermock.manual.OnlyForPrivateMethod;
import com.powermock.manual.StudentManager;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.powermock.api.mockito.PowerMockito.*;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;
import java.util.Date;


@RunWith(PowerMockRunner.class)
@PrepareForTest(OnlyForPrivateMethod.class)
public class OnlyForPrivateMethodTest {

    @InjectMocks
    private OnlyForPrivateMethod privateMethod;

    @Before
    public void setUp() {
         MockitoAnnotations.initMocks(this);
       // privateMethod = Mockito.spy(OnlyForPrivateMethod.class);
    }

    @Ignore
    @Test
    public void testNonPrivateMethod() throws Exception {
        doNothing().when(privateMethod).nonPrivateMethod();
        //doReturn(privateMethod).when(privateMethod).nonPrivateMethod();
        //verify(privateMethod, times(1)).nonPrivateMethod();
    }

    @Test
    public void testeCrateDirectory() throws Exception {

        String path = "D:\\TestData\\" + new Date().getTime();

        OnlyForPrivateMethod mockObj = spy(privateMethod);

       doNothing().when(mockObj, "createDirectory", path);
       verifyPrivate(mockObj);


    }
}
