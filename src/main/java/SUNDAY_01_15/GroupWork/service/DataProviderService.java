package SUNDAY_01_15.GroupWork.service;

import SUNDAY_01_15.GroupWork.entity.School;
import SUNDAY_01_15.GroupWork.entity.SchoolGroup;
import SUNDAY_01_15.GroupWork.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DataProviderService {


    public School createSchool(){


        School biliunoGimnazija = new School();
        biliunoGimnazija.setName("Biliuno gimnazija");

        SchoolGroup grupe1 = new SchoolGroup();


        Student eimantas = new Student();
        eimantas.setName("Eimantas");
        eimantas.setAge(15);
        eimantas.setSchoolGroup(grupe1);

        Student marija = new Student();
        marija.setName("Marija");
        marija.setAge(16);
        marija.setSchoolGroup(grupe1);

        List<Student> students = new ArrayList<>();
        students.add(eimantas);
        students.add(marija);

        grupe1.setSchool(biliunoGimnazija);
        grupe1.setStudents(students);
        List<SchoolGroup> groups = new ArrayList<>();
        groups.add(grupe1);


        biliunoGimnazija.setSchoolGroups(groups);

        return  biliunoGimnazija;
    }
}
