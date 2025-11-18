package edu.icet.ecom.config;

import edu.icet.ecom.model.entity.MemberEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private static final Configuration configuration = new Configuration();

    public static SessionFactory getSessionFactory(){
        if (null==sessionFactory){
            configuration.configure();
            configuration.addAnnotatedClass(MemberEntity.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
