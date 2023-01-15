package SUNDAY_01_15.GroupWork.repository;

import SUNDAY_01_15.GroupWork.entity.School;
import SUNDAY_01_15.example1.utils.HibernateUtilSunday;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SchoolRepo {


    public void save(School school) {


        Session session = HibernateUtilSunday.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(school);
        transaction.commit();

    }

    public List<School> findALL() {
        Session session = HibernateUtilSunday.getSessionFactory().openSession();
        List<School> schools = session.createQuery("from School", School.class).list();
        session.close();
        return schools;
    }
}
