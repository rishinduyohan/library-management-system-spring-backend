package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.BookEntity;

import java.util.List;

public interface BookRepository {
    boolean addBook(BookEntity book);

    boolean updateBook(BookEntity book);

    BookEntity getBook(String id);

    boolean deleteBook(String id);

    List<BookEntity> getAll();
}
