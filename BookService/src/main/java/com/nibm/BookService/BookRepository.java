/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nibm.BookService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
    
    @Query("select b from Book b where b.userReferenceId = ?1")
    Book findByUserReferenceId(String userReferenceId);
    
    @Modifying
    @Query("DELETE FROM Book WHERE id = ?1")
    public void deleteById(int id);
    
}
