package SUNDAY_01_15.GroupWork.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @ToString.Exclude
    private SchoolGroup schoolGroup;

}
