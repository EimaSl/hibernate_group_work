package SATURDAY_01_14.groupWork.repository;

import SATURDAY_01_14.groupWork.entity.Hospital;
import SATURDAY_01_14.groupWork.entity.Patient;
import SATURDAY_01_14.groupWork.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Repository {

    public void save(Hospital hospital, List<Patient> patientList) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(hospital);
        for (Patient patient : patientList) {
            session.save(patient) ;
        }

        transaction.commit();
        session.close();
    }
}

