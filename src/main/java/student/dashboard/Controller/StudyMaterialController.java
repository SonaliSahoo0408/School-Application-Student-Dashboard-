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

import student.dashboard.Model.StudyMaterial;
import student.dashboard.Service.StudyMaterialService;

@RestController
@RequestMapping("/api/v1/materials")
public class StudyMaterialController {
	private final StudyMaterialService service;

	public StudyMaterialController(StudyMaterialService service) {
		this.service = service;
	}

	@GetMapping
	public List<StudyMaterial> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public StudyMaterial get(@PathVariable Long id) {
		return service.getById(id);
	}

	@PostMapping
	public StudyMaterial create(@RequestBody StudyMaterial m) {
		return service.create(m);
	}

	@PutMapping("/{id}")
	public StudyMaterial update(@PathVariable Long id, @RequestBody StudyMaterial m) {
		return service.update(id, m);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}