package SUNDAY_01_15.example1;

import SUNDAY_01_15.example1.entity.Company;
import SUNDAY_01_15.example1.entity.Employee;
import SUNDAY_01_15.example1.utils.HibernateUtilSunday;
import org.hibernate.Session;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtilSunday.getSessionFactory().openSession();
        session.beginTransaction();

        Company tesla = new Company();
        tesla.setName("Tesla Corp");

        Employee elon = new Employee();
        elon.setName("Elon Musk");
        elon.setCompany(tesla);

        Employee vitalijus = new Employee();
        vitalijus.setName("Vitalijus");
        vitalijus.setCompany(tesla);

        tesla.setEmployees(Arrays.asList(elon,vitalijus));

        session.save(tesla); //saugom tik tesla, nes ji jau turi viduj employee
        session.getTransaction().commit();

        Company company = session.find(Company.class, 1L);
        System.out.println(company);

        session.beginTransaction();
        session.delete(company);
        session.getTransaction().commit();
    }
}
