package student.dashboard.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {
    List<Exam> findByExamDateAfter(LocalDate date);
}