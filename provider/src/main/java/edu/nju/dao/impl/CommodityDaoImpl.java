package edu.nju.dao.impl;

import edu.nju.dao.CommodityDao;
import edu.nju.po.Commodity;
import edu.nju.po.Tag;

import java.util.List;

public class CommodityDaoImpl implements CommodityDao {
    public boolean add(String userID, List<Commodity> commodities) {
        return false;
    }

    public boolean update(String userID, Commodity commodity) {
        return false;
    }

    public List<Commodity> getAll() {
        return null;
    }

    public List<Commodity> get(String userID) {
        return null;
    }

    public List<Commodity> getByTag(List<Tag> tags) {
        return null;
    }

    public boolean remove(String userID, List<Commodity> commodities) {
        return false;
    }
}
