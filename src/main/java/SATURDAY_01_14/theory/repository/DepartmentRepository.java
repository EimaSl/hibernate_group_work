package SATURDAY_01_14.theory.repository;

import SATURDAY_01_14.theory.entity.Department;
import org.hibernate.Session;
import org.hibernate.Transaction;
import SATURDAY_01_14.theory.utils.HibernateUtil;

import java.util.List;

/**
 * Repository provided methods to execute actions with Department able such as ;
 * 1.Create department.
 * 2. Update department.
 * 3.Delete department.
 * 4.Get/Fetch department(eg. By name).
 * 5. Get All departments
 */
public class DepartmentRepository {

    public void save(Department department) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(department);
        transaction.commit();
        session.close();
    }

    public void delete(Department department) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(department);
        transaction.commit();
        session.close();
    }

    public List<Department> findAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        //sesion.find() suranda obejkta pagal duota id
        List<Department> departments = session.createQuery("from Department", Department.class).list();
        return  departments;
    }

}
