package student.dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long>{

}
