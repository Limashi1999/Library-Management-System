/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nibm.BookService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */

@RestController
public class BookController {
    
    @Autowired
    private BookRepository bookRepository; 
    
    @CrossOrigin(origins = "*")     
    @GetMapping(path = "/books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/books/{userReferenceId}")
    public Book getBookByRef(@PathVariable String userReferenceId){
        return bookRepository.findByUserReferenceId(userReferenceId);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/books")
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }
    
     @CrossOrigin(origins = "*")
     @PutMapping(path = "/books/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book book){
        book.setId(id);
        bookRepository.save(book);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping("books/{id}")
    public void get(@PathVariable int id) {
        bookRepository.deleteById(id);
    }
    
    
}

