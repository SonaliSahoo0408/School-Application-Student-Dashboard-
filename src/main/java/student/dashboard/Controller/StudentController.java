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

import student.dashboard.Model.Student;
import student.dashboard.Service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	private final StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	@GetMapping
	public List<Student> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Student get(@PathVariable Long id) {
		return service.getById(id);
	}

	@PostMapping
	public Student create(@RequestBody Student s) {
		return service.create(s);
	}

	@PutMapping("/{id}")
	public Student update(@PathVariable Long id, @RequestBody Student s) {
		return service.update(id, s);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
