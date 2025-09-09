package student.dashboard.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.Student;
import student.dashboard.Repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository repo;
    public StudentService(StudentRepository repo) { this.repo = repo; }

    public List<Student> getAll() { return repo.findAll(); }
    public Student getById(Long id) { return repo.findById(id).orElse(null); }
    public Student create(Student s) { return repo.save(s); }
    public Student update(Long id, Student s) {
        if (repo.existsById(id)) {
            s.setId(id);
            return repo.save(s);
        }
        return null;
    }
    public void delete(Long id) { repo.deleteById(id); }
}