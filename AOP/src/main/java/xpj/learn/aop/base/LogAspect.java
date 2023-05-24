package xpj.learn.aop.base;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    @Before(value = "execution(public int xpj.learn.aop.base.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        System.out.println("Logger -> before method (args): " + methodName + " " + args);
    }

    @After("execution(public int xpj.learn.aop.base.CalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());

        System.out.println("Logger -> after method (args): " + methodName + " " + args);
    }

    @AfterReturning(value = "execution(public int xpj.learn.aop.base.CalculatorImpl.*(..))", returning = "result")
    public void afterReturn(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();


        System.out.println("Logger -> after returning (args): " + methodName + " " + result);

    }

//    @AfterThrowing(value, throwing="ex")



//    @Around()
//    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
//        try {
//            Object result = proceedingJoinPoint.proceed();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("Logger -> after method (args): ");
//        }
//
//    }


}
