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

import student.dashboard.Model.Announcement;
import student.dashboard.Service.AnnouncementService;

@RestController
@RequestMapping("/api/v1/announcements")
public class AnnouncementController {
	private final AnnouncementService service;

	public AnnouncementController(AnnouncementService service) {
		this.service = service;
	}

	@GetMapping
	public List<Announcement> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Announcement get(@PathVariable Long id) {
		return service.getById(id);
	}

	@GetMapping("/recent")
	public List<Announcement> recent() {
		return service.getRecent();
	}

	@PostMapping
	public Announcement create(@RequestBody Announcement a) {
		return service.create(a);
	}

	@PutMapping("/{id}")
	public Announcement update(@PathVariable Long id, @RequestBody Announcement a) {
		return service.update(id, a);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}