package student.dashboard.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.dashboard.Model.Route;
import student.dashboard.Service.RouteService;

@RestController
@RequestMapping("/api/v1/routes")
public class RouteController {
	private final RouteService service;

	public RouteController(RouteService service) {
		this.service = service;
	}

	@GetMapping
	public List<Route> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Route get(@PathVariable Long id) {
		return service.getById(id);
	}

	@GetMapping("/active")
	public Route active() {
		return service.getActiveRoute();
	}

	@PostMapping
	public Route create(@RequestBody Route r) {
		return service.create(r);
	}

	@PutMapping("/{id}")
	public Route update(@PathVariable Long id, @RequestBody Route r) {
		return service.update(id, r);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}