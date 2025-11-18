package edu.icet.ecom.repository;

import edu.icet.ecom.config.HibernateUtil;
import edu.icet.ecom.model.entity.MemberEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MemberRepository {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    public boolean addMember(MemberEntity member){
        session.persist(member);
        transaction.commit();
        return true;
    }

    public boolean updateMember(MemberEntity member){
        session.merge(member);
        transaction.commit();
        return true;
    }
    public MemberEntity getMember(String id){
        return session.find(MemberEntity.class,id);
    }
}
