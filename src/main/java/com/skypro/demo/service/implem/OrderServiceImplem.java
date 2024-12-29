package com.skypro.demo.service.implem;

import com.skypro.demo.service.OrderService;
import com.skypro.demo.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
public class OrderServiceImplem  implements OrderService {

    private final Basket basket;

    public OrderServiceImplem(Basket basket) {
        this.basket = basket;
    }


    @Override
    public String add(List<Integer> list) {
        basket.addOrder(list);
        return "Successfully added ID";
    }

    @Override
    public List<Integer> get(){
        return basket.getOrder();
    }

}
