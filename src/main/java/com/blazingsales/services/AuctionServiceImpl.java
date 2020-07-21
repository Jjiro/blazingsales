package com.blazingsales.services;


import com.blazingsales.entity.Auction;
import com.blazingsales.repository.AuctionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class AuctionServiceImpl implements AuctionService{


    @Autowired
    private AuctionRepo auctionRepo;

    @Override
    public boolean createAuction(Auction auction) throws Exception {
        return false;
    }

    @Override
    public boolean modifyAuction(UUID id, Auction auction) throws Exception {
        return false;
    }

    @Override
    public boolean cancelAuction(UUID id) throws Exception {
        return false;
    }

    @Override
    public List<Auction> getAllAuctions() {
        return null;
    }

    @Override
    public List<Auction> getAllAuctionsByCategory() {
        return null;
    }

    @Override
    public List<Auction> getAllAuctionsByUser() {
        return null;
    }

    @Override
    public Auction getById(UUID id) {
        return null;
    }

}
