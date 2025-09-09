package student.dashboard.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.Route;
import student.dashboard.Repository.RouteRepository;

@Service
public class RouteService {
	private final RouteRepository repo;

	public RouteService(RouteRepository repo) {
		this.repo = repo;
	}

	public List<Route> getAll() {
		return repo.findAll();
	}

	public Route getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public Route getActiveRoute() {
		return repo.findAll().stream().findFirst().orElse(null);
	}

	public Route create(Route r) {
		return repo.save(r);
	}

	public Route update(Long id, Route r) {
		if (repo.existsById(id)) {
			r.setId(id);
			return repo.save(r);
		}
		return null;
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}