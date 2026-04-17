package com.example.heribooks.service.impl;

import com.example.heribooks.model.Category;
import com.example.heribooks.repository.CategoryRepo;
import com.example.heribooks.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo repo;

    @Override
    public Category save(Category category) {
        return repo.save(category);
    }

    @Override
    public Category update(Integer id, Category category) {
        category.setIdCategory(id);
        return repo.save(category);
    }

    @Override
    public List<Category> findAll() {
        return repo.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return repo.findById(id).orElse(new Category(999,"No category"));
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    /*public CategoryServiceImpl (CategoryRepo repo){
        this.repo=repo;
    }*/

    /*@Override
    public Category validAndReturn(int id) {
        //repo=new CategoryRepoIImpl(); --esto ya no ocupa
        if(id>0){
        return repo.getCategoryById(id);
    }
        else {
            return new Category(0, "No tittle", "Anonimo", false);
        }
}*/
}
