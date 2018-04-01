package edu.nju.serviceImpl.order;

import edu.nju.po.Order;
import edu.nju.service.order.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/service.xml"})
public class OrderServiceImplTest {

    @Autowired
    OrderService orderService;

    @Test
    public void create() {
        orderService.create(new Order());
    }

    @Test
    public void check() {
        orderService.create(new Order());
    }

    @Test
    public void refund() {
        orderService.check("123");
    }
}