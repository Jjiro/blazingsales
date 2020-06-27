package com.blazingsales.BlazingSales.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Purchasing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String auction;
    private String user;
    private float price;
    private boolean isActive;
}
