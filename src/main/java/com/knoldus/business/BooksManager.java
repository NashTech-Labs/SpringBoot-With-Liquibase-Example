package com.knoldus.business;

import com.knoldus.persistence.entities.Book;
import com.knoldus.persistence.repositories.BookRepository;
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
public class BooksManager {

  /**
   * BookRepository used to describe to
   * encapsulate the logic required to access data sources.
   */
  private final BookRepository bookRepository;

  @Autowired
  public BooksManager(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public Stream<Book> getAllBooks() {
    return StreamSupport.stream(bookRepository.findAll().spliterator(), true);
  }
}
