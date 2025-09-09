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

import student.dashboard.Model.LibraryBook;
import student.dashboard.Service.LibraryService;

@RestController
@RequestMapping("/api/v1/library")
public class LibraryController {
	private final LibraryService service;

	public LibraryController(LibraryService service) {
		this.service = service;
	}

	@GetMapping
	public List<LibraryBook> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public LibraryBook get(@PathVariable Long id) {
		return service.getById(id);
	}

	@PostMapping
	public LibraryBook create(@RequestBody LibraryBook b) {
		return service.create(b);
	}

	@PutMapping("/{id}")
	public LibraryBook update(@PathVariable Long id, @RequestBody LibraryBook b) {
		return service.update(id, b);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}