package com.manipal.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manipal.onlinebookstore.entity.Book;

public interface BookRepository  extends JpaRepository<Book,Long>{

}
