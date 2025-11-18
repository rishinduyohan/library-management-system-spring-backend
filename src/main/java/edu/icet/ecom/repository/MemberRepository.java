package edu.icet.ecom.repository;

import edu.icet.ecom.config.HibernateUtil;
import edu.icet.ecom.model.entity.MemberEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MemberRepository {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();

    public boolean addMember(MemberEntity member){
        Transaction transaction = session.beginTransaction();
        session.persist(member);
        transaction.commit();
        return true;
    }

    public boolean updateMember(MemberEntity member){
        Transaction transaction = session.beginTransaction();
        session.merge(member);
        transaction.commit();
        return true;
    }
    public MemberEntity getMember(String id){
        return session.find(MemberEntity.class,id);
    }
    public boolean deleteMember(String id){
        Transaction transaction = session.beginTransaction();
        session.remove(getMember(id));
        transaction.commit();
        return true;
    }
    public List<MemberEntity> getAll(){
        return session.createQuery("FROM MemberEntity",MemberEntity.class).list();
    }
}
