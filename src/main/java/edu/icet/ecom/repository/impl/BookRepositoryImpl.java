package edu.icet.ecom.repository.impl;

import edu.icet.ecom.config.HibernateUtil;
import edu.icet.ecom.model.entity.BookEntity;
import edu.icet.ecom.repository.BookRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory(BookEntity.class);
    Session session = sessionFactory.openSession();

    @Override
    public boolean addBook(BookEntity book) {
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        transaction.commit();
        return true;
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
