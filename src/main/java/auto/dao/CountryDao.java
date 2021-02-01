package auto.dao;

import auto.config.HibernateSessionFactoryUtil;
import auto.model.Country;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.UUID;

public class CountryDao {

    public void createTable() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Country country = new Country();
        country.setCountry_name("russia");
        session.save(country);
        tx.commit();
        session.close();
    }
}
