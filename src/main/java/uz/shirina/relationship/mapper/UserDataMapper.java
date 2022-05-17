package uz.shirina.relationship.mapper;

import org.springframework.stereotype.Component;
import uz.shirina.relationship.DTO.UserDataDTO;
import uz.shirina.relationship.domain.User;
import uz.shirina.relationship.domain.UserData;

@Component
public class UserDataMapper {
    public UserData mapUserDatDTOToUserDataDomain(UserDataDTO userDataDTO, User user){
        return new UserData(user, userDataDTO.getFirstName(), userDataDTO.getLastName());
    }
    public UserDataDTO mapUserDataDomainToUserDataDTO(UserData userData){
        return new UserDataDTO(userData.getId(), userData.getUser().getId(), userData.getFirstName(), userData.getLastName());
    }
}
