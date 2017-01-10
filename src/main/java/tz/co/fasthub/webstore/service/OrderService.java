package tz.co.fasthub.webstore.service;

import tz.co.fasthub.webstore.domain.Order;

public interface OrderService {

    Long saveOrder(Order order);
}
