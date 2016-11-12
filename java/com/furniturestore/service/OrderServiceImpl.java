package com.furniturestore.service;

import com.furniturestore.dao.OrderDao;
import com.furniturestore.model.Cart;
import com.furniturestore.model.CartItem;
import com.furniturestore.model.UserOrder;
import com.furniturestore.service.CartService;
import com.furniturestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartService cartService;

    public void addOrder(UserOrder userOrder) {
    	orderDao.addOrder(userOrder);
    }

    public double getOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }
}
