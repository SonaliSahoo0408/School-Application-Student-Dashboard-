package student.dashboard.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import student.dashboard.Model.LibraryBook;
import student.dashboard.Repository.LibraryBookRepository;

@Service
public class LibraryService {
	private final LibraryBookRepository repo;

	public LibraryService(LibraryBookRepository repo) {
		this.repo = repo;
	}

	public List<LibraryBook> getAll() {
		return repo.findAll();
	}

	public LibraryBook getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public LibraryBook create(LibraryBook b) {
		return repo.save(b);
	}

	public LibraryBook update(Long id, LibraryBook b) {
		if (repo.existsById(id)) {
			b.setId(id);
			return repo.save(b);
		}
		return null;
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
