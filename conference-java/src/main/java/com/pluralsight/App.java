package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      SpeakerService service = new SpeakerServiceImpl();
      
    	System.out.println("firstName: "+service.findList().get(0).getFirstName());
    }
}
