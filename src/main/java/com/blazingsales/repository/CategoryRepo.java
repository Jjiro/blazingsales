package com.blazingsales.repository;

import com.blazingsales.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface CategoryRepo extends JpaRepository<Category, UUID> {

    Optional<Category> findByName (String name);
    
}
