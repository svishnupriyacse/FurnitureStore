package com.furniturestore.service;

import com.furniturestore.model.Cart;


public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
