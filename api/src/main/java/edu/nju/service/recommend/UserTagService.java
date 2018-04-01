package edu.nju.service.recommend;

import edu.nju.po.Tag;

import java.util.List;

public interface UserTagService {

    boolean addUserTag( List<Tag> tags);

    List<Tag> getUserTag(String userID);

    boolean update(Tag tag);

    boolean remove(Tag tag);
}
