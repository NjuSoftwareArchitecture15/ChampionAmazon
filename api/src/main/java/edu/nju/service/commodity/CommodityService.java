package edu.nju.service.commodity;

import edu.nju.po.Commodity;

import java.util.List;

public interface CommodityService {

    boolean addCommodities(String userID, List<Commodity> commodities);

    List<Commodity> getCommodities();

    List<Commodity> getCommodities(String userID);

    boolean update(String userID, List<Commodity> commodities);

    boolean remove(String userID, List<Commodity> commodities);
}
