package com.powermock.manual;

import java.io.File;

public class OnlyForPrivateMethod {

    private void createDirectory(String dir) throws Exception{
        boolean success = false;
        if(!new File(dir).exists())
           success = new File(dir).mkdirs();
        if(! success)
            throw new Exception("no dir found");
        System.out.println(success);

        //return dir;
    }

    public void nonPrivateMethod(){
        System.out.println("Non private method working fine.");
    }

    public static void main(String[] args) throws Exception {
        OnlyForPrivateMethod only  = new OnlyForPrivateMethod();
        only.createDirectory("C:\\Users\\ryewale\\eclipse-workspace\\mockprivatemethod\\test2.txt");
        only.nonPrivateMethod();
    }
}
