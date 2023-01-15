package SATURDAY_01_14.groupWork.repository;

import SATURDAY_01_14.groupWork.entity.Patient;
import SATURDAY_01_14.theory.entity.Department;
import SATURDAY_01_14.theory.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Repository provided methods to execute actions with Patient able such as ;
 * 1.Create patient.
 * 2. Update  patient
 * 3.Delete  patient
 * 4.Get/Fetch  patient(eg. By name).
 * 5. Get All  patient
 */
public class PatientRepository {

    public void save(Patient patient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(patient);
        transaction.commit();
        session.close();
    }

    public Patient findByName(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Patient where name= :name");
        query.setParameter("name", name);
        Patient patient = (Patient) query.uniqueResult();
        session.close();
        return patient;
    }

    public Patient findByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Patient where email= :email");
        query.setParameter("email", email);
        Patient patient = (Patient) query.uniqueResult();
        session.close();
        return patient;
    }

    public void update(Patient patient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(patient);
        transaction.commit();
        session.close();
    }


    public void delete(Patient patient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(patient);
        transaction.commit();
        session.close();
    }

    public void saveAll(List<Patient> patients) {

        //Session session reikia apjungti kartu darant session.save(hospital)
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        for (Patient patient : patients) {
            session.save(patient);
        }
        transaction.commit();
        session.close();
    }

//    public void makeRelationship(){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        String hql = "SELECT * FROM patient p WHERE p.hospitalId = :hospital.id";
//        Query query = session.createQuery(hql);
//        query.setParameter("hospital.id", 1);
//        List<Patient> patients = query.list();
//
//    }
//    public void createTables(){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        List<Patient> patients =  session.createQuery("from patient  where patient.id = :patient")
//                .setParameter("patient",)
//                .list();
//    }


}
