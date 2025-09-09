package student.dashboard.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import student.dashboard.Model.Announcement;
import student.dashboard.Repository.AnnouncementRepository;

@Service
public class AnnouncementService {
	private final AnnouncementRepository repo;

	public AnnouncementService(AnnouncementRepository repo) {
		this.repo = repo;
	}

	public List<Announcement> getAll() {
		return repo.findAll();
	}

	public Announcement getById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public List<Announcement> getRecent() {
		return repo.findAll();
	} // add sort in repo if needed

	public Announcement create(Announcement a) {
		a.setPostedAt(java.time.LocalDateTime.now());
		return repo.save(a);
	}

	public Announcement update(Long id, Announcement a) {
		if (repo.existsById(id)) {
			a.setId(id);
			return repo.save(a);
		}
		return null;
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}