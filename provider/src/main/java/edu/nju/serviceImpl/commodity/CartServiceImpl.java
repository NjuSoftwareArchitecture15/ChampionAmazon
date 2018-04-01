package edu.nju.serviceImpl.commodity;

import edu.nju.monitor.heartbeat.HeartbeatChecker;
import edu.nju.po.Cart;
import edu.nju.service.commodity.CartService;

public class CartServiceImpl implements CartService {

    private HeartbeatChecker heartbeatChecker;

    public CartServiceImpl() {
        heartbeatChecker = HeartbeatChecker.getInstance();
    }

    public boolean addCart(Cart cart) {
        return false;
    }

    public Cart check(String userID) {
        return null;
    }

    public boolean update(Cart cart) {
        return false;
    }

    public boolean empty(String userID) {
        return false;
    }
}
