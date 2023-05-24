package xpj.learn.iocxml.clazz;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("clazz.xml");

        Student stu = context.getBean("iocxml-student", Student.class);

        stu.study();


    }

}
