package edu.icet.ecom.repository;

import edu.icet.ecom.config.HibernateUtil;
import edu.icet.ecom.model.dto.MemberDTO;
import edu.icet.ecom.model.entity.MemberEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MemberRepository {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    public boolean addMember(MemberEntity member){
        session.persist(member);
        transaction.commit();
        return true;
    }
}
