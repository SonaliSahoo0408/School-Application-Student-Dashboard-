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

import student.dashboard.Model.Grade;
import student.dashboard.Service.GradeService;

@RestController
@RequestMapping("/api/v1/grades")
public class GradeController {
	private final GradeService service;

	public GradeController(GradeService service) {
		this.service = service;
	}

	@GetMapping
	public List<Grade> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Grade get(@PathVariable Long id) {
		return service.getById(id);
	}

	@GetMapping("/student/{studentId}")
	public List<Grade> byStudent(@PathVariable Long studentId) {
		return service.getRecentForStudent(studentId);
	}

	@PostMapping
	public Grade create(@RequestBody Grade g) {
		return service.create(g);
	}

	@PutMapping("/{id}")
	public Grade update(@PathVariable Long id, @RequestBody Grade g) {
		return service.update(id, g);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}