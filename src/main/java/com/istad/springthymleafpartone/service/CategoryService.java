package com.istad.springthymleafpartone.service;

import com.istad.springthymleafpartone.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(int id);
}