package com.ecom.service;

import com.ecom.model.Category;

import java.util.List;

public interface CategoryService {

    public Category saveCategory(Category category);
    public Boolean existsByName(String name);
    public List<Category> getAllCategories();
    public Boolean deleteCategory(int id);
    public  Category getCategoryById(int id);
}
