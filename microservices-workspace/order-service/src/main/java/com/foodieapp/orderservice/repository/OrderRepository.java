package com.foodieapp.orderservice.repository;

import com.foodieapp.orderservice.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetails, String> {


}
