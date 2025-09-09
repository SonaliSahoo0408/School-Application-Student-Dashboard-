package student.dashboard.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.Exam;
import student.dashboard.Repository.ExamRepository;

@Service
public class ExamService {
	private final ExamRepository repo;

	public ExamService(ExamRepository repo) {
		this.repo = repo;
	}

	public List<Exam> getAll() {
		return repo.findAll();
	}

	public Exam getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Exam create(Exam e) {
		return repo.save(e);
	}

	public Exam update(Long id, Exam e) {
		e.setId(id);
		return repo.save(e);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Exam> getUpcoming() {
		return repo.findByExamDateAfter(LocalDate.now());
	}
}