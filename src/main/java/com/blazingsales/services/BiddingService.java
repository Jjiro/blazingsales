package com.blazingsales.services;

import com.blazingsales.entity.Bidding;
import java.util.List;
import java.util.UUID;


public interface BiddingService {

    boolean createBidding(Bidding bidding) throws Exception;

    boolean updateBidding(Bidding bidding);

    List<Bidding> getAllBiddingAccounts();

    Bidding getById(UUID id);

    boolean deleteBiddingById(UUID id);

    boolean restoreBiddingById(UUID id);

}
