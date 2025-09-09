package student.dashboard.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.LibraryBook;

public interface LibraryBookRepository extends JpaRepository<LibraryBook, Long>{
	List<LibraryBook> findByAvailableTrue();
    List<LibraryBook> findByTitleContainingIgnoreCase(String title);
}
