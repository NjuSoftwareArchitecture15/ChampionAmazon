package edu.nju.dao;

import edu.nju.po.Commodity;
import edu.nju.po.Tag;

import java.util.List;

public interface CommodityDao {

    boolean add(String userID, List<Commodity> commodities);

    boolean update(String userID, Commodity commodity);

    List<Commodity> getAll();

    List<Commodity> get(String userID);

    List<Commodity> getByTag(List<Tag> tags);

    boolean remove(String userID, List<Commodity> commodities);
}
