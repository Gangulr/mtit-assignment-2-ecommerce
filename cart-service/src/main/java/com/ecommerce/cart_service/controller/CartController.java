package com.ecommerce.cart_service.controller;

import com.ecommerce.cart_service.model.Cart;
import com.ecommerce.cart_service.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cart> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Cart add(@RequestBody Cart cart) {
        return service.save(cart);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}