package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.entity.BookEntity;
import edu.icet.ecom.repository.BookRepository;
import edu.icet.ecom.repository.impl.BookRepositoryImpl;
import edu.icet.ecom.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    BookRepository bookRepository = new BookRepositoryImpl();
    @Override
    public boolean addBook(BookEntity book) {
        return bookRepository.addBook(book);
    }

    @Override
    public boolean updateBook(BookEntity book) {
        return false;
    }

    @Override
    public BookEntity getBook(String id) {
        return null;
    }

    @Override
    public boolean deleteBook(String id) {
        return false;
    }

    @Override
    public List<BookEntity> getAll() {
        return List.of();
    }
}
