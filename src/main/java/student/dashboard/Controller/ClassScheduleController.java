package student.dashboard.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.dashboard.Model.ClassSchedule;
import student.dashboard.Service.ClassScheduleService;

@RestController
@RequestMapping("/api/v1/schedules")
public class ClassScheduleController {
	private final ClassScheduleService service;

	public ClassScheduleController(ClassScheduleService service) {
		this.service = service;
	}

	@GetMapping
	public List<ClassSchedule> all() {
		return service.getAll();
	}

	@GetMapping("/date/{date}")
	public List<ClassSchedule> byDate(@PathVariable String date) {
		return service.getByDate(LocalDate.parse(date));
	}

	@PostMapping
	public ClassSchedule create(@RequestBody ClassSchedule cs) {
		return service.create(cs);
	}

	@PutMapping("/{id}")
	public ClassSchedule update(@PathVariable Long id, @RequestBody ClassSchedule cs) {
		return service.update(id, cs);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}