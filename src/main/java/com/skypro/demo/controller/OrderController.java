package com.skypro.demo.controller;

import com.skypro.demo.service.implem.OrderServiceImplem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store/order")
public class OrderController {

    private final OrderServiceImplem orderService;

    public OrderController(OrderServiceImplem orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam List<Integer> items) {
        return orderService.add(items);
    }

    @GetMapping(path = "/get")
    public List<Integer> get(){
        return orderService.get();
    }
}
