package com.knoldus.persistence.repositories;

import com.knoldus.persistence.entities.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Book - the domain type the repository manages
 * Integer - the type of the id of the entity the repository manages
 */
public interface BookRepository extends CrudRepository<Book, Integer> {

}
