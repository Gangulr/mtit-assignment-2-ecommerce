package com.ecommerce.order_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.order_service.model.Order;
import com.ecommerce.order_service.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getAll() {
        return repository.findAll();
    }

    public Order save(Order order) {
        return repository.save(order);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}