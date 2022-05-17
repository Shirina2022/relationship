package uz.shirina.relationship.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.shirina.relationship.domain.DayEnum;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DayDTO {
    private Long id;
    private DayEnum day;
}
