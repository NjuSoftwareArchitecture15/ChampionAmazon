package edu.nju.dao.impl;

import edu.nju.dao.BackupDao;
import edu.nju.po.Commodity;
import edu.nju.po.Order;

import java.util.List;

public class BackupDaoImpl implements BackupDao {
    public boolean backupOrder(List<Order> orders) {
        return false;
    }

    public boolean backupCommodity(List<Commodity> commodities) {
        return false;
    }

    public List<Order> getOrders() {
        return null;
    }

    public List<Commodity> getCommodities() {
        return null;
    }

    public boolean removeOrder(List<Order> orders) {
        return false;
    }

    public boolean removeCommodity(List<Commodity> commodities) {
        return false;
    }
}
