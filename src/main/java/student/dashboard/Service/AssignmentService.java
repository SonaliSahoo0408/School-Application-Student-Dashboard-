package student.dashboard.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.Assignment;
import student.dashboard.Repository.AssignmentRepository;

@Service
public class AssignmentService {
	private final AssignmentRepository repo;

	public AssignmentService(AssignmentRepository repo) {
		this.repo = repo;
	}

	public List<Assignment> getAll() {
		return repo.findAll();
	}

	public Assignment getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Assignment create(Assignment a) {
		return repo.save(a);
	}

	public Assignment update(Long id, Assignment a) {
		a.setId(id);
		return repo.save(a);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Assignment> getUpcoming() {
		return repo.findByDueDateAfter(LocalDate.now());
	}
}