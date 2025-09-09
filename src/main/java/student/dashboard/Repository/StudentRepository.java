package student.dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
