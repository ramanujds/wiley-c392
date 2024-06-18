package com.foodieapp.orderservice.service;

import com.foodieapp.orderservice.dto.OrderRequestDto;
import com.foodieapp.orderservice.model.MenuItem;
import com.foodieapp.orderservice.model.OrderDetails;
import com.foodieapp.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public OrderDetails createOrder(OrderRequestDto orderRequest) {

        OrderDetails orderDetails = new OrderDetails();

        List<MenuItem> items = new ArrayList<>();


        orderRequest.menuItems().forEach(menuItemDto -> {
            MenuItem item = restTemplate.getForObject("http://MENU-SERVICE/menus/" + menuItemDto.id(), MenuItem.class);
            items.add(item);
        });

        double totalAmount = items.stream().mapToDouble(MenuItem::getPrice).sum();
        orderDetails.getItem().addAll(items);
        orderDetails.setTotalAmount(totalAmount);
        orderDetails.setStatus("ORDER_PLACED");
        String orderId = "ORD" + System.currentTimeMillis();
        orderDetails.setOrderId(orderId);
        return orderRepository.save(orderDetails);
    }

    @Override
    public OrderDetails getOrder(String orderId) {
        return null;
    }

    @Override
    public List<OrderDetails> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderDetails updateOrderStatus(String orderId, String status) {
        return null;
    }

    @Override
    public void deleteOrder(String orderId) {

    }
}
