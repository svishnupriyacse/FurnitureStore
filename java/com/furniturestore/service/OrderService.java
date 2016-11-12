package com.furniturestore.service;

import com.furniturestore.model.UserOrder;


public interface OrderService {

    void addOrder(UserOrder order);

    double getOrderGrandTotal(int cartId);
}
