package com.rd99.orderservice.repository;

import com.rd99.orderservice.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{
}
