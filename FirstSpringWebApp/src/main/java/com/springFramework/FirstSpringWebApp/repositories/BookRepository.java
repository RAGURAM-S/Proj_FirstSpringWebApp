package com.springFramework.FirstSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springFramework.FirstSpringWebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
