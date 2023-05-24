package xpj.learn.ioc.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xpj.learn.ioc.config.SpringConfig;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("ioc-user", User.class);
        System.out.println(user);
    }
}
