package com.blazingsales.BlazingSales.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class PurchaseFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String purchase;
    private String sellersRating;
    private String sellersComment;
    private String buyersRating;
    private String buyersComment;
    private boolean isActive;
}
