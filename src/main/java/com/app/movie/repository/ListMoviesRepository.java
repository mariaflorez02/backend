/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.movie.repository;

import com.app.movie.entities.Category;
import com.app.movie.interfaces.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class ListMoviesRepository {
    
    @Autowired
    ICategoryRepository repository;
    
    public Iterable<Category> getAll(){
        return repository.findAll();
    }
    
    public Optional<Category> findById(String id){
        Optional<Category> response= repository.findById(id);
        return response;
    }
    
    public Boolean existsById(String id){
        return repository.existsById(id);
    }
    
    public void deleteById(String id){
        repository.deleteById(id);
    }
    
    public Category save(Category category){
        return repository.save(category);
    }
    
}
