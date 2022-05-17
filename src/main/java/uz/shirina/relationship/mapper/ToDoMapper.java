package uz.shirina.relationship.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.shirina.relationship.DTO.DayDTO;
import uz.shirina.relationship.DTO.ToDoDTO;
import uz.shirina.relationship.domain.Day;
import uz.shirina.relationship.domain.DayEnum;
import uz.shirina.relationship.domain.ToDo;
import uz.shirina.relationship.domain.User;
import uz.shirina.relationship.repository.DayReapository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class ToDoMapper {
    @Autowired
    DayReapository dayReapository;
    @Autowired
    UserMapper userMapper;
    @Autowired
    DayMapper dayMapper;
    public ToDo mapToDoDTOToDoDomain(ToDoDTO toDoDTO, User user){
        Set<DayEnum> dayEnums = new HashSet<>();
        toDoDTO.getDays().forEach(dayDTO -> {
            dayEnums.add(dayDTO.getDay());
        });
        List<Day> allByDayIn = dayReapository.findAllByDayIn(dayEnums);
        return new ToDo(toDoDTO.getId(), toDoDTO.getTitle(), toDoDTO.getDescription(), toDoDTO.getTime(),user,allByDayIn);
    }

    public ToDoDTO mapToDoDomainToDoDTO(ToDo toDo){
        ArrayList<DayDTO> dayDTOS = new ArrayList<>();
        toDo.getDays().forEach(day -> {
            dayDTOS.add(dayMapper.mapDayDomainToDayDto(day));
        });
        return new ToDoDTO(toDo.getId(),toDo.getTitle(),toDo.getDescription(),toDo.getTime(),userMapper.mapUserDomainToUserDtoWithoutToDo(toDo.getUser()),dayDTOS);
    }

}
