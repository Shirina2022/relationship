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
public class ToDo {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column
    private  String description;
    @Column
    private String time;
    @ManyToOne
    private User user;
    @ManyToMany
    private List<Day> days;
}
