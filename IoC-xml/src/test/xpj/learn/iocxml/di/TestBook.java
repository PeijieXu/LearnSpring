package xpj.learn.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");

        Book book = context.getBean("iocxml-di-book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testConstructor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");

        Book book = (Book) context.getBean("iocxml-di-book-con");
        System.out.println(book);
    }
}
