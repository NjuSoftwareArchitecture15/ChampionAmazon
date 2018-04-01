package edu.nju.dao;

import edu.nju.po.Commodity;
import edu.nju.po.Order;

import java.util.List;

public interface BackupDao {

    boolean backupOrder(List<Order> orders);

    boolean backupCommodity(List<Commodity> commodities);

    List<Order> getOrders();

    List<Commodity> getCommodities();

    boolean removeOrder(List<Order> orders);

    boolean removeCommodity(List<Commodity> commodities);
}
