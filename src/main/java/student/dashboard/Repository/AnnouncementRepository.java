package student.dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Announcement;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long>{

}
