package SUNDAY_01_15.GroupWork.repository;

;
import SUNDAY_01_15.GroupWork.entity.Student;
import SUNDAY_01_15.example1.utils.HibernateUtilSunday;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentRepo {

    public List<Student> create(String name) {

        Student student = new Student();
        student.setName(name);
        Session session = HibernateUtilSunday.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();

        return null;
    }
}

