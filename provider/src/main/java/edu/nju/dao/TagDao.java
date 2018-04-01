package edu.nju.dao;

import edu.nju.po.Tag;

import java.util.List;

public interface TagDao {

    boolean add(List<Tag> tags);

    List<Tag> get(String userID);

    boolean update(List<Tag> tags);

    boolean remove(List<Tag> tags);
}
