package edu.nju.outerProxy;

import edu.nju.po.Order;

public class ApiService {

    public boolean onlinePay(Order order) {
        return true;
    }

    public boolean bankPay(Order order) {
        return true;
    }

    public boolean citizenIdentity(String cardNumber) {
        return true;
    }
}
