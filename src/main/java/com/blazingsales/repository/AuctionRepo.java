package com.blazingsales.repository;


import com.blazingsales.entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;


@Repository
public interface AuctionRepo extends JpaRepository<Auction, UUID> {

}
