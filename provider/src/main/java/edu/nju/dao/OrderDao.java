package edu.nju.dao;

import edu.nju.po.Order;

public interface OrderDao {

    boolean add(Order order);

    boolean update(Order order);

    Order getOrder(String userID);
}
