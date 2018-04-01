package edu.nju.serviceImpl.order;

import edu.nju.po.Order;
import edu.nju.service.order.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    public boolean create(Order order) {
        System.out.println("create order");
        return true;
    }

    public List<Order> check(String userID) {
        System.out.println("check order");
        return null;
    }

    public boolean refund(Order order) {
        System.out.println("refund order");
        return true;
    }
}
