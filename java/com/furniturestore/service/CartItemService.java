package com.furniturestore.service;

import com.furniturestore.model.Cart;
import com.furniturestore.model.CartItem;


public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);
}
