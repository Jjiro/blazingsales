package com.blazingsales.services;

import com.blazingsales.entity.Category;
import java.util.List;
import java.util.UUID;


public interface CategoryService {

    boolean createCategory(Category category) throws Exception;

    boolean modifyCategory(UUID id, Category category) throws Exception;

    boolean cancelCategory(UUID id) throws Exception;

    List<Category> getAllCategories();

    List<Category> getAllCategoryByName();

    Category getById(UUID id);
    
}
