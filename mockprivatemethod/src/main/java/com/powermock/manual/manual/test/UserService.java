package com.powermock.manual.manual.test;

import java.util.List;

public class UserService {

    private Company savePrefrence(long uId, long cId, List<User> userList) {
        Company company = new Company();
        for (User u : userList) {
            company.setCompanyId(u.getUserId());
            company.setUserId(u.getCompanyId());
        }
        return company;
    }

    public static String callStaticMethod(){
        return "Welcome to PowerMock Static method invocation....!";
    }

     static private int privateStaticMethod(int year){
        return year;
    }
}
