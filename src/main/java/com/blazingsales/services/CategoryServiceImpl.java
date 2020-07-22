package com.blazingsales.services;

import com.blazingsales.entity.Category;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class CategoryServiceImpl  implements CategoryService {


    @Override
    public boolean createCategory(Category category) throws Exception {
        return false;
    }

    @Override
    public boolean modifyCategory(UUID id, Category category) throws Exception {
        return false;
    }

    @Override
    public boolean cancelCategory(UUID id) throws Exception {
        return false;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public List<Category> getAllCategoryByName() {
        return null;
    }

    @Override
    public Category getById(UUID id) {
        return null;
    }

}
