package com.oldfish.mooc.springdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ConsumerClient
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");
        ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
        context.start();
        while (true){
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            System.out.println(serviceAPI.sendMessage(message));
        }

    }
}
