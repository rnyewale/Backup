package com.power.mock.main;

public class StudentDetails {
    private int id;
    private String name;

    public StudentDetails() {}

    public StudentDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public StudentDetails display() {
        return new StudentDetails("Ram Yewale", 2411);
    }

    private void getStudentPersonalDetails() {
        final String PAN_ID = "AK*P*9*R";
        final String ADHAR_CARD = "2165464**564*5*";

        System.out.println("Confidentials Detaild: " + PAN_ID + " " + ADHAR_CARD);
    }
}
