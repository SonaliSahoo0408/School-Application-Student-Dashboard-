package student.dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.LibraryBook;

public interface LibraryBookRepository extends JpaRepository<LibraryBook, Long>{

}
