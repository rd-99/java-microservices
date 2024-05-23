package com.rd99.orderservice.service;


import com.rd99.orderservice.dto.OrderLineItemdto;
import com.rd99.orderservice.dto.OrderRequest;
import com.rd99.orderservice.model.Order;
import com.rd99.orderservice.model.OrderLineItems;
import com.rd99.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemdtoList()
                .stream()
                .map(this::maptoDto).toList();

        order.setOrderLineItems(orderLineItems);
        orderRepository.save(order);


    }

    private OrderLineItems maptoDto(OrderLineItemdto orderLineItemdto) {
        OrderLineItems orderLineItem = new OrderLineItems();

        orderLineItem.setSkuCode(orderLineItemdto.getSkuCode());
        orderLineItem.setPrice(orderLineItemdto.getPrice());
        orderLineItem.setQuantity(orderLineItemdto.getQuantity());

        return orderLineItem;

    }

}
