package SATURDAY_01_14.groupWork;

import SATURDAY_01_14.groupWork.entity.*;
import SATURDAY_01_14.groupWork.repository.PatientRepository;
import SATURDAY_01_14.groupWork.repository.Repository;
import SATURDAY_01_14.groupWork.service.JsonService;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Hospital raudonoKryziaus = new Hospital("Raudonasis Kryzius");


        Patient patient1 = new Patient("Tadas", raudonoKryziaus);
        Patient patient2 = new Patient("Marija", raudonoKryziaus);
        Patient patient3 = new Patient("Tomas", raudonoKryziaus);
        Patient patient4 = new Patient("Vaidotas", raudonoKryziaus);

        PatientRepository patientRepository = new PatientRepository();
        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
         patientRepository.saveAll(patientList);
        new Repository().save(raudonoKryziaus, patientList);
        new JsonService().transferListToJson(patientList, "pacientai");
        Patient tadasGalimai = patientRepository.findByName("Tadas");
        System.out.println(tadasGalimai);

        // patientRepository.saveAll(patientList);


    }
}
