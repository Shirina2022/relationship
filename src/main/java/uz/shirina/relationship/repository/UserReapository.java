package uz.shirina.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shirina.relationship.domain.User;

public interface UserReapository extends JpaRepository<User,Long> {
}
