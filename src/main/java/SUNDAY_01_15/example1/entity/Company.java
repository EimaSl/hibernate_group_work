package SUNDAY_01_15.example1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//Parent entity klases(tevine klase arba tevine lentele)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor //BUTINA kai dedam ENTITY
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;

}
