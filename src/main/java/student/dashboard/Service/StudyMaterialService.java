package student.dashboard.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.StudyMaterial;
import student.dashboard.Repository.StudyMaterialRepository;

@Service
public class StudyMaterialService {
	private final StudyMaterialRepository repo;

	public StudyMaterialService(StudyMaterialRepository repo) {
		this.repo = repo;
	}

	public List<StudyMaterial> getAll() {
		return repo.findAll();
	}

	public StudyMaterial getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public StudyMaterial create(StudyMaterial m) {
		return repo.save(m);
	}

	public StudyMaterial update(Long id, StudyMaterial m) {
		if (repo.existsById(id)) {
			m.setId(id);
			return repo.save(m);
		}
		return null;
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}