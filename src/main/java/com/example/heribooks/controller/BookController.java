package com.example.heribooks.controller;

import com.example.heribooks.model.Book;
import com.example.heribooks.repository.BookRepo;
import com.example.heribooks.service.BookService;
import com.example.heribooks.service.impl.BookServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

   // private String texto;

   /* public BookController (BookService service){
        this.service=service;
    }*/

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> list =  service.findAll();

        return ResponseEntity.ok(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") Integer id){
        Book book =  service.findById(id);

        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        Book newbook = service.save(book);

        return ResponseEntity.status(HttpStatus.CREATED).body(newbook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable ("id") Integer id, @RequestBody Book book){
        Book newbook = service.update(id, book);

        return ResponseEntity.status(HttpStatus.CREATED).body(newbook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") Integer id){
        service.delete(id);

        return ResponseEntity.noContent().build();
    }


   /* @GetMapping
    public Book getBook(){
        //service = new BookServiceImpl();   esto ya no se ocupa
        return service.validAndReturn(1);
    }*/
}
