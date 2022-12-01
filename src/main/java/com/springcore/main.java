package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/configFile.xml");
        
        Student std= (Student)context.getBean("std");
        
        //FOR ERROR LOOK VIDEO 9/main/java/com/springcore/configFile.xml
        
        System.out.println(std);
    }
}
