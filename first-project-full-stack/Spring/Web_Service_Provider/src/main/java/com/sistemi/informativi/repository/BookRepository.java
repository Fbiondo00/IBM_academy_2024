package com.sistemi.informativi.repository;

import com.sistemi.informativi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository  extends JpaRepository<Book,String> {




}
