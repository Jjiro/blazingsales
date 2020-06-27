package com.blazingsales.BlazingSales.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String photos;
    private String category;
    private float minimumPrice;
    private float buyNowPrice;
    private String promoted;
    private String location;
    private LocalDateTime auctionStartDate;
    private LocalDateTime auctionEndDate;
    private int auctionPayViews;
    private boolean isActive;
}
