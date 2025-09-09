package student.dashboard.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.Grade;
import student.dashboard.Repository.GradeRepository;

@Service
public class GradeService {
	private final GradeRepository repo;

	public GradeService(GradeRepository repo) {
		this.repo = repo;
	}

	public List<Grade> getAll() {
		return repo.findAll();
	}

	public Grade getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public List<Grade> getRecentForStudent(Long studentId) {
		return repo.findAll(); // filter by studentId in real repo
	}

	public Grade create(Grade g) {
		return repo.save(g);
	}

	public Grade update(Long id, Grade g) {
		if (repo.existsById(id)) {
			g.setId(id);
			return repo.save(g);
		}
		return null;
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}