package com.example.heribooks.repository;

import com.example.heribooks.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
    //Book getBookById(int id);
}
