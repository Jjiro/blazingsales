package com.blazingsales.repository;

import com.blazingsales.entity.Bidding;
import com.blazingsales.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface BiddingRepo extends JpaRepository<Bidding, UUID> {

    Optional<Bidding> findByUser(User user);

}
