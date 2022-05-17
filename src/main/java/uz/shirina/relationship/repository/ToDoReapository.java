package uz.shirina.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shirina.relationship.domain.ToDo;

public interface ToDoReapository extends JpaRepository<ToDo,Long> {
}
