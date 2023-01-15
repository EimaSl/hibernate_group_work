package SUNDAY_01_15.GroupWork.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
//yra rezervuotu zodziu GROUP , USER negalima vadint klasiu pavadinimu
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SchoolGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "school_id")
    @ToString.Exclude
   private  School school;

    @ToString.Exclude
    @OneToMany(mappedBy = "schoolGroup", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;



}
