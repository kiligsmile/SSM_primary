package com.smile.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
//    @Pointcut("execution(* com.smile.service.*Service.*(..))")
//    private void servicePt(){}

//    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp){
        Signature signature=pjp.getSignature();
        String className=signature.getDeclaringTypeName();
        String methodName=signature.getName();

        long start =System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            try {
                pjp.proceed();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("万次执行时间："+className+"."+methodName+"--->"+ (end-start)+"ms");
    }
}
