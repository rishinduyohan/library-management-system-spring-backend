package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.entity.BookEntity;
import edu.icet.ecom.repository.BookRepository;
import edu.icet.ecom.repository.impl.BookRepositoryImpl;
import edu.icet.ecom.service.BookService;
import org.springframework.http.ResponseEntity;

public class BookServiceImpl implements BookService {
    BookRepository bookRepository = new BookRepositoryImpl();
    @Override
    public boolean addBook(BookEntity book) {
        return bookRepository.addBook(book);
    }

    @Override
    public boolean updateBook(BookEntity book) {
        return bookRepository.updateBook(book);
    }

    @Override
    public Object getBook(String id) {
        return bookRepository.getBook(id)!=null?bookRepository.getBook(id): ResponseEntity.ok("There is not such book in that id");
    }

    @Override
    public boolean deleteBook(String id) {
        return bookRepository.deleteBook(id);
    }

    @Override
    public Object getAll() {
        return bookRepository.getAll() != null ? bookRepository.getAll() : ResponseEntity.ok("Empty books!");
    }
}
