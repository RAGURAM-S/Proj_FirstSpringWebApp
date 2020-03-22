package com.springFramework.FirstSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springFramework.FirstSpringWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
