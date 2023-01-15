import SATURDAY_01_14.theory.entity.Department;
import SATURDAY_01_14.theory.repository.DepartmentRepository;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Department itDepartment = new Department();
        itDepartment.setName("IT Gurus");
        itDepartment.setBudged(new BigDecimal(150000));

        Department transportDept = new Department();
        transportDept.setName("UAB FASTWHEELS");
        transportDept.setBudged(new BigDecimal(320000));

        DepartmentRepository departmentRepository = new DepartmentRepository();
        departmentRepository.save(itDepartment);
        departmentRepository.save(transportDept);

        departmentRepository.delete(itDepartment);


        System.out.println(departmentRepository.findAll());

    }
}
