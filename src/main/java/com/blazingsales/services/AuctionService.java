package com.blazingsales.services;

import com.blazingsales.entity.Auction;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public interface AuctionService {

    boolean createAuction(Auction auction) throws Exception;

    boolean modifyAuction(UUID id, Auction auction) throws Exception;

    boolean cancelAuction(UUID id) throws Exception;

    List<Auction> getAllAuctions();
    List<Auction> getAllAuctionsByCategory();
    List<Auction> getAllAuctionsByUser();
    Auction getById(UUID id);

}
