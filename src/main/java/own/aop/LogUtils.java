package own.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class LogUtils {

    /*抽取可重用
     * 1.随便声明一个没有实现的返回void的空方法
     * 2.使用 @Pointcut注解
     * */
    @Pointcut("execution( * own.aop.MyMathCalculatorImpl.*(..))")
    public void myPoint() {}

    ;

    //在目标方法之前运行
    @Before("myPoint()")
    public static void logStart(JoinPoint joinPoint) {
        //获取目标方法运行时使用的参数
        Object[] args = joinPoint.getArgs();
        //获取方法签名
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(signature + " @Before方法执行，参数：" + Arrays.toString(args));
    }

    //在目标方法正常执行完成之后
    @AfterReturning(value = "myPoint()", returning = "result")
//告诉spring使用result接收返回值
    public static void logReturn(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature() + "@AfterReturning方法执行，参数：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("返回值" + result);
    }

    //在目标方法出现异常时候执行
    //告诉spring使用ex接收异常
    @AfterThrowing(value = "myPoint()", throwing = "ex")
    public static void logException(JoinPoint joinPoint, Exception ex) {
        System.out.println(joinPoint.getSignature() + "@AfterThrowing方法执行，参数：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("异常内容" + ex);
    }

    //在目标方法结束时候执行
    @After("myPoint()")
    public static void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature() + " @After方法执行，参数：" + Arrays.toString(joinPoint.getArgs()));
    }

    @Around("myPoint()")
    public Object myRound(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        Object proceed=null;
        try {
            System.out.println("@Around 前置通知");
            //利用反射调用目标方法,就是method.invoke（）
             proceed = pjp.proceed(args);
            System.out.println("@Around 返回通知");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("@Around 异常通知");
        } finally {
            System.out.println("@Around 后置通知");
        }
        //反射调用后的返回值也一定返回出去
        return proceed;

    }
}
