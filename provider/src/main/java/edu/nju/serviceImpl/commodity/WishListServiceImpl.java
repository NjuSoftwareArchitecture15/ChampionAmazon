package edu.nju.serviceImpl.commodity;

import edu.nju.monitor.heartbeat.HeartbeatChecker;
import edu.nju.po.WishList;
import edu.nju.service.commodity.WishListService;

public class WishListServiceImpl implements WishListService {

    private HeartbeatChecker heartbeatChecker;

    public WishListServiceImpl() {
        heartbeatChecker = HeartbeatChecker.getInstance();
    }

    public boolean addCart(WishList wishList) {
        return false;
    }

    public WishList check(String userID) {
        return null;
    }

    public boolean update(WishList wishList) {
        return false;
    }

    public boolean empty(String userID) {
        return false;
    }
}
