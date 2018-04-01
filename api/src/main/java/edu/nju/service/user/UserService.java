package edu.nju.service.user;

import edu.nju.po.User;

public interface UserService {

    boolean create(User user);

    boolean update(User user);

    User retrieve(String userID);

    boolean delete(String userID);
}
