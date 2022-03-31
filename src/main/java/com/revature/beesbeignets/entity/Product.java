package com.revature.beesbeignets.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PRODUCT_TABLE")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String name;
    private int quantity;
    private double price;
}
