package com.example.library_management.repository;

import com.example.library_management.model.Author;
import com.example.library_management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//should and must I understand all repository and how it work ...etc
@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
