package student.dashboard.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Announcement;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long>{
	List<Announcement> findTop5ByOrderByCreatedAtDesc();
    List<Announcement> findByCreatedAtAfter(LocalDateTime dateTime);
}
