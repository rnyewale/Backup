package com.power.mock.main;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Started.....!");

        StudentDetails studentDetails = new StudentDetails();
        StudentDetails stud= studentDetails.display();
        System.out.println(stud);
    }
}
