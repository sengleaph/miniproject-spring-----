package com.istad.springthymleafpartone.repository;

import com.istad.springthymleafpartone.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    List<Category> categories = new ArrayList<>(){{
        add(new Category(1, "Home"));
        add(new Category(2, "Art"));
        add(new Category(3, "Game"));
    }};
    public List<Category> getCategories() {
        return categories;
    }
    public Category getCategoryById(int id){
        return categories.stream().filter((category -> category.getCategoryId()==id)).findFirst().orElse(
                null
        );
    }
}

