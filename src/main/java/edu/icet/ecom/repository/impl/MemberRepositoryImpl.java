package edu.icet.ecom.repository.impl;

import edu.icet.ecom.config.HibernateUtil;
import edu.icet.ecom.model.entity.MemberEntity;
import edu.icet.ecom.repository.MemberRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory(MemberEntity.class);
    Session session = sessionFactory.openSession();
    @Override
    public boolean addMember(MemberEntity member){
        Transaction transaction = session.beginTransaction();
        session.persist(member);
        transaction.commit();
        return true;
    }
    @Override
    public boolean updateMember(MemberEntity member){
        Transaction transaction = session.beginTransaction();
        session.merge(member);
        transaction.commit();
        return true;
    }
    @Override
    public MemberEntity getMember(String id){
        return session.find(MemberEntity.class,id);
    }
    @Override
    public boolean deleteMember(String id){
        Transaction transaction = session.beginTransaction();
        session.remove(getMember(id));
        transaction.commit();
        return true;
    }
    @Override
    public List<MemberEntity> getAll(){
        return session.createQuery("FROM MemberEntity",MemberEntity.class).list();
    }
}
