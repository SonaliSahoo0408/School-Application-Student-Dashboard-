package student.dashboard.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.ClassSchedule;

public interface ClassScheduleRepository extends JpaRepository<ClassSchedule, Long> {
	List<ClassSchedule> findByDate(LocalDate date);
}