
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xpj.learn.User;

//import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogBuilder;

public class UserTest {

//    private Logger logger =

    @Test
    public void testUserObject() {
        // load spring config file, cretae object / spring container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        User user = (User) context.getBean("userClassId");
        System.out.println(user);

        // call methods on the bean
        user.add();

    }

    /**
     * 通过Java自带反射创建对象
     * @throws Exception
     */
    @Test
    public void testUserObject1() throws Exception {
        // get Class object
        Class clazz = Class.forName("xpj.learn.User");
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }


    @Test
    public void testAdd() {
        User user = new User();
        user.add();
    }

}