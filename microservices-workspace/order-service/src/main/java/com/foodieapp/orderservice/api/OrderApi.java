package com.foodieapp.orderservice.api;

import com.foodieapp.orderservice.dto.OrderRequestDto;
import com.foodieapp.orderservice.model.OrderDetails;
import com.foodieapp.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderApi {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderDetails createOrder(@RequestBody OrderRequestDto orderRequest) {
        return orderService.createOrder(orderRequest);
    }

    @GetMapping
    public List<OrderDetails> getAllOrders(){
        return orderService.getAllOrders();
    }

}
