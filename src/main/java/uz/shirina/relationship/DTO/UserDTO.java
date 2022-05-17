package uz.shirina.relationship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.shirina.relationship.domain.UserData;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private UserDataDTO userData;
    private List<ToDoDTO> toDoDTOS;
}
