package com.example.heribooks.service.impl;

import com.example.heribooks.model.Book;
import com.example.heribooks.model.Category;
import com.example.heribooks.repository.BookRepo;
import com.example.heribooks.repository.BookRepoIImpl;
import com.example.heribooks.service.BookService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo repo;

    @Override
    public Book save(Book book) {
        return repo.save(book);
    }

    @Override
    public Book update(Integer id, Book book) {
        book.setIdBook(id);
        return repo.save(book);
    }

    @Override
    public List<Book> findAll() {
        return repo.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return repo.findById(id).orElse(new Book(0,"Sin titulo", "anonimo", new Category(999, "No category"),false));
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    /*public BookServiceImpl (BookRepo repo){
        this.repo=repo;
    }*/

    /*@Override
    public Book validAndReturn(int id) {
        //repo=new BookRepoIImpl(); --esto ya no ocupa
        if(id>0){
        return repo.getBookById(id);
    }
        else {
            return new Book(0, "No tittle", "Anonimo", false);
        }
}*/
}
