package SATURDAY_01_14.groupWork.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Patient  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    private Hospital hospital;

    public Patient( String name, Hospital hospital) {
        this.name = name;
        this.hospital = hospital;
    }
}
