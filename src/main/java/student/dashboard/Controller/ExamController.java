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

import student.dashboard.Model.Exam;
import student.dashboard.Service.ExamService;

@RestController
@RequestMapping("/api/v1/exams")
public class ExamController {
	private final ExamService service;

	public ExamController(ExamService service) {
		this.service = service;
	}

	@GetMapping
	public List<Exam> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Exam get(@PathVariable Long id) {
		return service.getById(id);
	}

	@GetMapping("/upcoming")
	public List<Exam> upcoming() {
		return service.getUpcoming();
	}

	@PostMapping
	public Exam create(@RequestBody Exam e) {
		return service.create(e);
	}

	@PutMapping("/{id}")
	public Exam update(@PathVariable Long id, @RequestBody Exam e) {
		return service.update(id, e);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}