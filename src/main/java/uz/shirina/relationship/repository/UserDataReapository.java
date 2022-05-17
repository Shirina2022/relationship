package uz.shirina.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shirina.relationship.domain.UserData;

public interface UserDataReapository extends JpaRepository<UserData,Long> {
}
