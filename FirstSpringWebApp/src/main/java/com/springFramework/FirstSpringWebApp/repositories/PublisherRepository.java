package com.springFramework.FirstSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springFramework.FirstSpringWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
