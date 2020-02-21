package com.powermock.manual;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    public static Student getStudent() {
        return new Student();
    }

    private String getStudentById(int rollNo) {
        return getStudent().getName();
    }

    private double getGradeById(int id) {
        return getStudent().getGrade();
    }

    public static String getNameById(int id) {
        if(getStudent().getRollNo()==id)
            return getStudent().getName();
        return  "no record found";

    }
}
