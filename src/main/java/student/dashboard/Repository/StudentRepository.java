package student.dashboard.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByNameContainingIgnoreCase(String name);
}
