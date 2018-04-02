package edu.nju.service.commodity;

import edu.nju.po.WishList;

public interface WishListService {

    boolean addCart(WishList wishList);

    WishList check(String userID);

    boolean update(WishList wishList);

    boolean empty(String userID);
}
