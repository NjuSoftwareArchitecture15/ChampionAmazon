package edu.nju.service.commodity;

import edu.nju.po.Cart;

public interface CartService {

    boolean addCart(Cart cart);

    Cart check(String userID);

    boolean update(Cart cart);

    boolean empty(String userID);
}
