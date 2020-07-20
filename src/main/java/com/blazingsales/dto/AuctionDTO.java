package com.blazingsales.dto;

import com.blazingsales.entity.Auction;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
public class AuctionDTO extends Auction {

    @NotEmpty
    private String title;

    @NotEmpty
    private String description;

    @NotEmpty
    private byte photos;

    @NotEmpty
    private String category;

    @NotEmpty
    private float minimumPrice;

    @NotEmpty
    private float buyNowPrice;

    @NotEmpty
    private String promoted;

    @NotEmpty
    private String location;

    @NotEmpty
    private LocalDateTime auctionStartDate;

    @NotEmpty
    private LocalDateTime auctionEndDate;

    @NotEmpty
    private int auctionPageViews;

    @NotEmpty
    private boolean status;


}
