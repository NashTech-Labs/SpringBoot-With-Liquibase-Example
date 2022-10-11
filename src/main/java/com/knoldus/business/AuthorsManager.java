package com.knoldus.business;

import com.knoldus.persistence.entities.Author;
import com.knoldus.persistence.repositories.AuthorRepository;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * AuthorsManager used to indicate Authors of book
 *
 * @author shashikant
 * @version OpenJdk 11.0.0
 *
 */
@Component
public class AuthorsManager {

  /**
   * AuthorRepository used to describe to
   * encapsulate the logic required to access data sources.
   */
  private final AuthorRepository authorRepository;

  @Autowired
  public AuthorsManager(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public Stream<Author> getAllAuthors() {
    return StreamSupport.stream(authorRepository.findAll().spliterator(), true);
  }
}
