package com.example.heribooks.service;

import com.example.heribooks.model.Category;

import java.util.List;

public interface CategoryService {
    //Category validAndReturn(int id);
    Category save(Category category);
    Category update(Integer id, Category category);
    List<Category> findAll();
    Category findById(Integer id);
    void delete(Integer id);

}