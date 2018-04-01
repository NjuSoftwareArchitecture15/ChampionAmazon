package edu.nju.serviceImpl.commodity;

import edu.nju.monitor.heartbeat.HeartbeatChecker;
import edu.nju.po.Commodity;
import edu.nju.service.commodity.CommodityService;

import java.util.List;

public class CommodityServiceImpl implements CommodityService {

    private HeartbeatChecker heartbeatChecker;

    public CommodityServiceImpl() {
        this.heartbeatChecker = HeartbeatChecker.getInstance();
    }

    public boolean addCommodities(String userID, List<Commodity> commodities) {
        return false;
    }

    public List<Commodity> getCommodities() {
        return null;
    }

    public List<Commodity> getCommodities(String userID) {
        return null;
    }

    public boolean update(String userID, List<Commodity> commodities) {
        return false;
    }

    public boolean remove(String userID, List<Commodity> commodities) {
        return false;
    }
}
