package SATURDAY_01_14.theory.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity //traktuos klase kaip duomenu bazes lentele
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id //sukurs pirmini rakta
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pasiziureti kas tai yra
    private Integer departmentId;
    private String name;
    private BigDecimal budged;

}
