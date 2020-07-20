package com.blazingsales.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Data
public class Auction {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(updatable = false, nullable = false)
    @Type(type = "org.hibernate.type.UUIDCharType")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String title;
    private String description;
    private byte photos;
    private String category;
    private float minimumPrice;
    private float buyNowPrice;
    private String promoted;
    private String location;
    private LocalDateTime auctionStartDate;
    private LocalDateTime auctionEndDate;
    private int auctionPageViews;
    private boolean isActive;

}
