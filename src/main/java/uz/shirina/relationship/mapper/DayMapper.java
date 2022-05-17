package uz.shirina.relationship.mapper;

import org.springframework.stereotype.Component;
import uz.shirina.relationship.DTO.DayDTO;
import uz.shirina.relationship.domain.Day;

@Component
public class DayMapper {
    public Day mapDayDTOToDayDomain(DayDTO dayDTO){
        return new Day(dayDTO.getDay());
    }
    public DayDTO mapDayDomainToDayDto(Day day){
        return new DayDTO(day.getId(), day.getDay());
    }
}
