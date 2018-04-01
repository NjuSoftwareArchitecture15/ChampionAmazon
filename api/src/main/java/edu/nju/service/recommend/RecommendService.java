package edu.nju.service.recommend;

import edu.nju.po.Commodity;

import java.util.List;

public interface RecommendService {

    List<Commodity> recommend(String userID);

}
