package uz.shirina.relationship.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserData {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private User user;
    @Column
    private String firstName;
    @Column
    private String lastName;
}
