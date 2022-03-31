package com.revature.beesbeignets.repository;

import com.revature.beesbeignets.dto.OrderResponse;
import com.revature.beesbeignets.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.revature.beesbeignets.dto.OrderResponse(c.customerName , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInfo();
}
