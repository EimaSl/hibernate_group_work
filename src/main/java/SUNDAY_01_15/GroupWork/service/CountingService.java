package SUNDAY_01_15.GroupWork.service;

import SUNDAY_01_15.GroupWork.entity.School;
import SUNDAY_01_15.GroupWork.entity.SchoolGroup;
import SUNDAY_01_15.GroupWork.entity.Student;
import SUNDAY_01_15.example1.utils.HibernateUtilSunday;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CountingService {

    public Double getAverageAge() {
        Session session = HibernateUtilSunday.getSessionFactory().openSession();
         Query query =  session.createQuery("SELECT avg(age) from Student", Double.class);
        Double average = (Double) query.uniqueResult();
        System.out.println(average);
        return  average;
    }
}
