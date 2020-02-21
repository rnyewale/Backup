package com.power.mock.test;

import com.power.mock.main.StudentDetails;
import com.sun.xml.internal.fastinfoset.QualifiedName;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames="com.power.mock.main.*")
public class StudentDetailsTest {
    @Mock
    private StudentDetails studentDetails;

    @Before
    public void inti(){
        MockitoAnnotations.initMocks(studentDetails);
    }

    public void testDisplay() throws Exception{
        Mockito.when(studentDetails.display()).thenReturn(new StudentDetails("Ram Yewale", 2411));
    }
}

