package com.example.heribooks.controller;

import com.example.heribooks.model.Category;
import com.example.heribooks.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

   // private String texto;

   /* public CategoryController (CategoryService service){
        this.service=service;
    }*/

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategorys(){
        List<Category> list =  service.findAll();

        return ResponseEntity.ok(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") Integer id){
        Category category =  service.findById(id);

        return ResponseEntity.ok(category);
    }

    @PostMapping
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        Category newcategory = service.save(category);

        return ResponseEntity.status(HttpStatus.CREATED).body(newcategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable ("id") Integer id, @RequestBody Category category){
        Category newcategory = service.update(id, category);

        return ResponseEntity.status(HttpStatus.CREATED).body(newcategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable("id") Integer id){
        service.delete(id);

        return ResponseEntity.noContent().build();
    }


   /* @GetMapping
    public Category getCategory(){
        //service = new CategoryServiceImpl();   esto ya no se ocupa
        return service.validAndReturn(1);
    }*/
}
