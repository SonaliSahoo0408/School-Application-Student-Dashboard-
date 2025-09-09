package student.dashboard.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import student.dashboard.Model.Activity;
import student.dashboard.Repository.ActivityRepository;

@Service
public class ActivityService {
	private final ActivityRepository repo;

	public ActivityService(ActivityRepository repo) {
		this.repo = repo;
	}

	public List<Activity> getAll() {
		return repo.findAll();
	}

	public Activity getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Activity create(Activity a) {
		return repo.save(a);
	}

	public Activity update(Long id, Activity a) {
		if (repo.existsById(id)) {
			a.setId(id);
			return repo.save(a);
		}
		return null;
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}