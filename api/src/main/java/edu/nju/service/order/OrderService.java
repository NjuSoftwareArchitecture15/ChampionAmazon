package edu.nju.service.order;

import edu.nju.po.Order;

import java.util.List;

public interface OrderService {

    boolean create(Order order);

    List<Order> check(String userID);

    boolean refund(Order order);

}
