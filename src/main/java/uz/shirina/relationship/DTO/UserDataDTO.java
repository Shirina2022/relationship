package uz.shirina.relationship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDataDTO {
    private Long id;
    private Long userId;
    private String firstName;
    private String lastName;
}
