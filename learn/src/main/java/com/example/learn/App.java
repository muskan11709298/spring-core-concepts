package com.example.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/learn/config.xml");
      Student s = context.getBean("student", Student.class);
      Branch b=  context.getBean("branch", Branch.class);
      
      System.out.println(s);
      System.out.println(b);
    }
}