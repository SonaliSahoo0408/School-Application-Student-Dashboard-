package student.dashboard.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.ClassSchedule;
import student.dashboard.Repository.ClassScheduleRepository;

@Service
public class ClassScheduleService {
    private final ClassScheduleRepository repo;
    public ClassScheduleService(ClassScheduleRepository repo) { this.repo = repo; }

    public List<ClassSchedule> getAll() { return repo.findAll(); }
    public List<ClassSchedule> getByDate(LocalDate date) { return repo.findByDate(date); }
    public ClassSchedule create(ClassSchedule cs) { return repo.save(cs); }
    public ClassSchedule update(Long id, ClassSchedule cs) {
        if (repo.existsById(id)) {
            cs.setId(id);
            return repo.save(cs);
        }
        return null;
    }
    public void delete(Long id) { repo.deleteById(id); }
}