package uz.shirina.relationship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.shirina.relationship.domain.Day;
import uz.shirina.relationship.domain.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDTO {
    private Long id;
    private String title;
    private  String description;
    private String time;
    private UserDTO user;
    private List<DayDTO> days;
}
