package com.xkcoding.interceptor;

import com.xkcoding.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 15:13
 */
@Slf4j
@Aspect
@Component
public class TimeInterceptor {

    @Around("@annotation(com.xkcoding.annotation.TimeChecker)")
    public Object arroud(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getDeclaringTypeName() + "." + signature.getName();

        long start = System.currentTimeMillis();
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            log.error("方法：{}, 异常", methodName,e);
            throw e;
        }

        long end = System.currentTimeMillis();
        printExecTime(methodName, start, end);

        return result;

    }

    private void printExecTime(String methodName,long startTime, long endTime) {
        long execTime = endTime - startTime;
        log.info("方法：{}，执行时间：{} ms", methodName, execTime);
    }

}
