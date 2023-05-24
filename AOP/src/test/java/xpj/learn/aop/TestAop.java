package xpj.learn.aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xpj.learn.aop.base.Calculator;
import xpj.learn.aop.config.SpringConfig;

public class TestAop {

    @Test
    public void testAdd(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);


        Calculator calculator = context.getBean( Calculator.class);
        calculator.add(1,1);
    }
}
