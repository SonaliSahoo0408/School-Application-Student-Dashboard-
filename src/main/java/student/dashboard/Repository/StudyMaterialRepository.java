package student.dashboard.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.StudyMaterial;

public interface StudyMaterialRepository extends JpaRepository<StudyMaterial, Long>{
	List<StudyMaterial> findBySubjectContainingIgnoreCase(String subject);
}
