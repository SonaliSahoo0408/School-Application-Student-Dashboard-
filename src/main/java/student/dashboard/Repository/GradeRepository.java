package student.dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long>{

}
