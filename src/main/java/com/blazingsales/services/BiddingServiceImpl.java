package com.blazingsales.services;

import com.blazingsales.entity.Bidding;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class BiddingServiceImpl implements BiddingService {


    @Override
    public boolean createBidding(Bidding bidding) throws Exception {
        return false;
    }

    @Override
    public boolean updateBidding(Bidding bidding) {
        return false;
    }

    @Override
    public List<Bidding> getAllBiddingAccounts() {
        return null;
    }

    @Override
    public Bidding getById(UUID biddingId) {
        return null;
    }

    @Override
    public boolean deleteBiddingById(UUID biddingId) {
        return false;
    }

    @Override
    public boolean restoreBiddingById(UUID biddingId) {
        return false;
    }
}
