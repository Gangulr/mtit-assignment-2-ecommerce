package com.ecommerce.cart_service.service;

import com.ecommerce.cart_service.model.Cart;
import com.ecommerce.cart_service.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository repository;

    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public List<Cart> getAll() {
        return repository.findAll();
    }

    public Cart save(Cart cart) {
        return repository.save(cart);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}