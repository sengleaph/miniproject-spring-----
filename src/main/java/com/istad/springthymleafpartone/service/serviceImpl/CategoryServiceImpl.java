package com.istad.springthymleafpartone.service.serviceImpl;

import com.istad.springthymleafpartone.model.Category;
import com.istad.springthymleafpartone.repository.CategoryRepository;
import com.istad.springthymleafpartone.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;
    CategoryServiceImpl(){
        categoryRepository = new CategoryRepository();
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getCategories();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.getCategoryById(id);
    }
}
