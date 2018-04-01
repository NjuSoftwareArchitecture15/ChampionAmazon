package edu.nju;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Shenmiu
 * @date 2018/04/01
 * <p>
 * 订单日志记录
 */
@Component
@Aspect
public class OrderLogAspect {

    /**
     * 订单日志记录
     */
    @Before("within(edu.nju.serviceImpl.order.OrderServiceImpl)")
    public void before() {
        System.out.println("日志记录....");
    }

}
