package SUNDAY_01_15.GroupWork;


import SUNDAY_01_15.GroupWork.service.CountingService;
import SUNDAY_01_15.GroupWork.service.DataProviderService;
import SUNDAY_01_15.GroupWork.entity.School;
import SUNDAY_01_15.GroupWork.repository.SchoolRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        School biliunoGimnazija = new DataProviderService().createSchool();
        SchoolRepo schoolRepo  = new SchoolRepo();
        schoolRepo.save(biliunoGimnazija);
      List<School> schoolList = schoolRepo.findALL();
        System.out.println(schoolList.get(0).getName());
        CountingService countingService = new CountingService();
        countingService.getAverageAge();




    }
}
