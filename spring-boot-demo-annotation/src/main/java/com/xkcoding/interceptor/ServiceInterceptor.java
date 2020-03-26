package com.xkcoding.interceptor;

import com.google.common.collect.Maps;
import com.xkcoding.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 14:47
 */
@Slf4j
@Component
@Aspect()
public class ServiceInterceptor {

    @Around("@annotation(com.xkcoding.annotation.ErrorChecker)")
    public Object aroud(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object result = null;
        try {
            result = joinPoint.proceed();
            return result;
        } catch (Throwable e) {
            log.info("发生了异常：Method: {}",methodName,e);
            Result rs = new Result();
            rs.setStatus(0);
            rs.setData("发生异常");
            return rs;
        }
    }
}
