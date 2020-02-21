package com.powermock.manual;

public class StudentDriver {
    public static void main(String[] args) {

        Student stud = StudentManager.getStudent();
        stud.setRollNo(2411);
        stud.setName("Ram Yewale");
        stud.setGrade(6.8);

        System.out.println(stud.getName() + " " + (stud.getRollNo() + " " + stud.getGrade()));

    }
}
