package uz.shirina.relationship.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Day {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    @Enumerated(EnumType.STRING)
    private DayEnum day;
    @ManyToMany(mappedBy = "days")
    private List<ToDo> toDos;

    public Day(DayEnum day) {
        this.day = day;
    }
}
