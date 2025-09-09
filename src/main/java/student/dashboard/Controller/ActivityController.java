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

import student.dashboard.Model.Activity;
import student.dashboard.Service.ActivityService;

@RestController
@RequestMapping("/api/v1/activities")
public class ActivityController {
    private final ActivityService service;
    public ActivityController(ActivityService service) { this.service = service; }

    @GetMapping
    public List<Activity> all() { return service.getAll(); }

    @GetMapping("/{id}")
    public Activity get(@PathVariable Long id) { return service.getById(id); }

    @PostMapping
    public Activity create(@RequestBody Activity a) { return service.create(a); }

    @PutMapping("/{id}")
    public Activity update(@PathVariable Long id, @RequestBody Activity a) { return service.update(id, a); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}