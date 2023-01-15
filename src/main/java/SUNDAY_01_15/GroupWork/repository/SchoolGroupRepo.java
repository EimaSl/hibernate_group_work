package SUNDAY_01_15.GroupWork.repository;

import SUNDAY_01_15.GroupWork.entity.School;
import SUNDAY_01_15.GroupWork.entity.SchoolGroup;
import SUNDAY_01_15.GroupWork.entity.Student;
import SUNDAY_01_15.example1.utils.HibernateUtilSunday;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class SchoolGroupRepo {


    public List<SchoolGroup> createSchoolGroup(List<Student> students) {
        List<SchoolGroup> groups = new ArrayList<>();
        SchoolGroup schoolGroup = new SchoolGroup();
        groups.add(schoolGroup);
        return groups;
//        Session session = HibernateUtilSunday.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(group);
//        transaction.commit();
//        session.close();
    }
}
