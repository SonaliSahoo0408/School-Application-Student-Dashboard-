package student.dashboard.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long>{
	List<Activity> findByActivityDateAfter(LocalDate date);
}
