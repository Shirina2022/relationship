package uz.shirina.relationship.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uz.shirina.relationship.DTO.ToDoDTO;
import uz.shirina.relationship.DTO.UserDTO;
import uz.shirina.relationship.domain.ToDo;
import uz.shirina.relationship.domain.User;
import uz.shirina.relationship.domain.UserData;
import uz.shirina.relationship.repository.UserReapository;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {
    @Autowired
    UserDataMapper userDataMapper;
    @Autowired
    UserReapository userReapository;
    @Autowired
    ToDoMapper toDoMapper;
    public User mapUserDTOToUserDomain(UserDTO userDTO){
        User savedUser = userReapository.save(new User(userDTO.getName()));
        UserData userData = userDataMapper.mapUserDatDTOToUserDataDomain(userDTO.getUserData(), savedUser);
        savedUser.setUserData(userData);
        List<ToDo> toDos = new ArrayList<>();
        userDTO.getToDoDTOS().forEach(toDoDTO -> {
            toDos.add(toDoMapper.mapToDoDTOToDoDomain(toDoDTO,savedUser));
        });
        savedUser.setToDos(toDos);
        return savedUser;
    }

    public UserDTO mapUserDomainToUserDtoWithoutToDo(User user) {
        return new UserDTO(user.getId(), user.getName(), userDataMapper.mapUserDataDomainToUserDataDTO(user.getUserData()),new ArrayList<>());
    }

    public UserDTO mapUserDomainToUserDto(User user) {
        ArrayList<ToDoDTO> toDoDTOS = new ArrayList<>();
        user.getToDos().forEach(toDo -> {
            toDoDTOS.add(toDoMapper.mapToDoDomainToDoDTO(toDo));
        });
        return new UserDTO(user.getId(), user.getName(), userDataMapper.mapUserDataDomainToUserDataDTO(user.getUserData()),toDoDTOS);
    }
}
