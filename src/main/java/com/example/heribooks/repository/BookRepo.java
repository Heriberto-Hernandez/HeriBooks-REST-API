package com.example.heribooks.repository;

import com.example.heribooks.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
    //Book getBookById(int id);
}
