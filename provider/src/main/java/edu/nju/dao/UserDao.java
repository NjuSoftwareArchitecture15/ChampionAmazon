package edu.nju.dao;

import edu.nju.po.User;

public interface UserDao {

    boolean add(User user);

    boolean update(User user);

    User get(String userID);

    boolean remove(User user);
}
