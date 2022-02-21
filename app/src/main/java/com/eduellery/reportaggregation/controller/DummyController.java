package com.eduellery.reportaggregation.controller;

import com.eduellery.reportaggregation.model.Product;
import com.eduellery.reportaggregation.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DummyController {

    DummyService service;

    public DummyController(@Autowired DummyService service) {
        this.service = service;
    }

    @GetMapping(path = "/something")
    public List<Product> something() {
        return service.getProducts();
    }
}
