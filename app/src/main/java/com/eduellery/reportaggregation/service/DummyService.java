package com.eduellery.reportaggregation.service;

import com.eduellery.reportaggregation.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyService {

    public List<Product> getProducts() {
        return List.of(
                new Product("Apple", 1.3, "Just an apple"),
                new Product("iPhone", 999, "Just a product from Apple"),
                new Product("Apple Inc", 3_000_000_000_000L, "Apple market value")
        );
    }
}
