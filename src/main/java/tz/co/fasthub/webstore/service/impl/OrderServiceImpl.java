package tz.co.fasthub.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.co.fasthub.webstore.domain.Order;
import tz.co.fasthub.webstore.domain.repository.OrderRepository;
import tz.co.fasthub.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Long saveOrder(Order order) {
        return orderRepository.saveOrder(order);
    }
}
