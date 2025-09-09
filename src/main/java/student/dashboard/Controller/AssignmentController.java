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

import student.dashboard.Model.Assignment;
import student.dashboard.Service.AssignmentService;

@RestController
@RequestMapping("/api/v1/assignments")
public class AssignmentController {
	private final AssignmentService service;

	public AssignmentController(AssignmentService service) {
		this.service = service;
	}

	@GetMapping
	public List<Assignment> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Assignment get(@PathVariable Long id) {
		return service.getById(id);
	}

	@GetMapping("/upcoming")
	public List<Assignment> upcoming() {
		return service.getUpcoming();
	}

	@PostMapping
	public Assignment create(@RequestBody Assignment a) {
		return service.create(a);
	}

	@PutMapping("/{id}")
	public Assignment update(@PathVariable Long id, @RequestBody Assignment a) {
		return service.update(id, a);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
