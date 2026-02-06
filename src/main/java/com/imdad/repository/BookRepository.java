package com.imdad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imdad.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
