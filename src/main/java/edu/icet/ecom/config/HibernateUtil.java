package edu.icet.ecom.config;

import edu.icet.ecom.model.entity.MemberEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final Configuration configuration = new Configuration();
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if (null==sessionFactory){
            configuration.addAnnotatedClass(MemberEntity.class);
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
