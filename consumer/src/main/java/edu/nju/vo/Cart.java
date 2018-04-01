package edu.nju.vo;

import java.io.Serializable;
import java.util.List;

public class Cart implements Serializable {

    private String userID;

    private List<Commodity> commodities;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }
}
