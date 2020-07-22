package com.blazingsales.services;

import com.blazingsales.entity.Auction;
import java.util.List;
import java.util.UUID;


public interface AuctionService {

    boolean createAuction(Auction auction) throws Exception;

    boolean modifyAuction(UUID id, Auction auction) throws Exception;

    boolean cancelAuction(UUID id) throws Exception;

    Auction getById(UUID id);

    List<Auction> getAllAuctions();

    List<Auction> getAllAuctionsByCategory();

    List<Auction> getAllAuctionsByUser();

}
