package com.powermock.priv.method;

import com.powermock.manual.Student;
import com.powermock.manual.StudentManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StudentManager.class)
public class StudentManagerTest {

    @InjectMocks
    private StudentManager studentManager;

    @Mock
    private Student student;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDisplayAllStudent() throws Exception {
        //setting up student object with mock value.
        StudentManager.getStudent().setName("Ram Yewale");
        StudentManager.getStudent().setRollNo(2411);
        StudentManager.getStudent().setGrade(6.8);

        //stubbing StudentManager class with static mock.
        mockStatic(StudentManager.class);
        when(StudentManager.getNameById(2411)).thenReturn("Ram Yewale");

        //verify that call goes to static method.
        verifyStatic();

       /* String actual = StudentManager.getNameById(2411);
        System.out.println("actual: "+actual);
         Assert.assertEquals(StudentManager.getStudent().getName(), "Ram Yewale");
        */
    }

    @Test
    public void testGetGradeById() throws Exception {
        Student student = new Student();
        student.setGrade(7.3);
        student.setRollNo(2411);
        student.setName("PowerMock");

        StudentManager mngr = spy(studentManager);
        when(mngr, "getGradeById", 2411).thenReturn(7.3);

        verifyPrivate(mngr);
        Assert.assertEquals(7.3, student.getGrade(), 0);
    }
}
