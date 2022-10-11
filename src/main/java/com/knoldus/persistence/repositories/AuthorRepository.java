package com.knoldus.persistence.repositories;

import com.knoldus.persistence.entities.Author;
import org.springframework.data.repository.CrudRepository;
/**
 * Author - the domain type the repository manages
 * Integer - the type of the id of the entity the repository manages
 */
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
