package edu.icet.ecom.service;

import edu.icet.ecom.model.entity.BookEntity;

import java.util.List;

public interface BookService {
    boolean addBook(BookEntity book);

    boolean updateBook(BookEntity book);

    BookEntity getBook(String id);

    boolean deleteBook(String id);

    List<BookEntity> getAll();
}
