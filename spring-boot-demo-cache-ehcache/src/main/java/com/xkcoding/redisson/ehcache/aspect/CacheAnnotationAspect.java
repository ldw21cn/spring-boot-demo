package com.xkcoding.redisson.ehcache.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/26 22:13
 */
@Aspect
@Component
public class CacheAnnotationAspect {

    @Pointcut("@annotation(org.springframework.cache.annotation.CachePut)")
    public void cacheAnnotationPointCut() {

    }

    @Around("cacheAnnotationPointCut()")
    public void around(JoinPoint joinPoint) {
        MethodSignature sign = (MethodSignature) joinPoint.getSignature();
        Method method = sign.getMethod();
        CachePut annotation = method.getAnnotation(CachePut.class);

        System.out.println("CachePut key：" + annotation.key());
        System.out.println("CachePut value：" + annotation.value());

    }

}
