package tz.co.fasthub.webstore.domain.repository;


import tz.co.fasthub.webstore.domain.Order;

public interface OrderRepository {
    long saveOrder(Order order);
}
