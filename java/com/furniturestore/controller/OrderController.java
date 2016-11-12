package com.furniturestore.controller;

import com.furniturestore.model.Cart;
import com.furniturestore.model.UsersDetail;
import com.furniturestore.model.UserOrder;
import com.furniturestore.service.CartService;
import com.furniturestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * This controller is used to handle user order
 */
@Controller
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderService orderService;
    /*
     * createOrder method is used to insert user order into the database.
     */
    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
    	UserOrder userOrder = new UserOrder();
        Cart cart=cartService.getCartById(cartId);
        userOrder.setCart(cart);

        UsersDetail usersDetail = cart.getUsersDetail();
        userOrder.setUsersDetail(usersDetail);
        userOrder.setBillingAddress(usersDetail.getBillingAddress());
        userOrder.setShippingAddress(usersDetail.getShippingAddress());

        orderService.addOrder(userOrder);

        return "redirect:/checkout?cartId="+cartId;
    }
}
