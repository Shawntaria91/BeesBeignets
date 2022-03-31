package com.revature.beesbeignets.controller;

import com.revature.beesbeignets.dto.OrderRequest;
import com.revature.beesbeignets.dto.OrderResponse;
import com.revature.beesbeignets.entity.Customer;
import com.revature.beesbeignets.repository.CustomerRepository;
import com.revature.beesbeignets.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {

        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInfo() {
        return customerRepository.getJoinInfo();
    }
}
