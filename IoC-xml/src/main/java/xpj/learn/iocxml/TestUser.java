package xpj.learn.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 1. get bean using ID
        User user1 = (User) context.getBean("iocxml-user-classid");
        System.out.println("1. get bean using ID: " + user1);

        // 2. get bean using Class
        User user2 = context.getBean(User.class);
        System.out.println("2. get bean using Class: " + user2);

        // 3. get bean using ID and Class
        User user3 = context.getBean("iocxml-user-classid", User.class);
        System.out.println("3. get bean using ID and Class: " + user3);
    }

}
