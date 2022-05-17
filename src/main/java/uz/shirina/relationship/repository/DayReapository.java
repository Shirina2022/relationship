package uz.shirina.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shirina.relationship.domain.Day;
import uz.shirina.relationship.domain.DayEnum;

import java.util.Collection;
import java.util.List;

public interface DayReapository extends JpaRepository<Day,Long> {
    List<Day> findAllByDayIn(Collection<DayEnum> day);
}
