package com.foodieapp.orderservice.service;

import com.foodieapp.orderservice.dto.OrderRequestDto;
import com.foodieapp.orderservice.model.OrderDetails;

import java.util.List;

public interface OrderService {

    public OrderDetails createOrder(OrderRequestDto orderRequest);
    public OrderDetails getOrder(String orderId);
    public List<OrderDetails> getAllOrders();
    public OrderDetails updateOrderStatus(String orderId, String status);
    public void deleteOrder(String orderId);
}
