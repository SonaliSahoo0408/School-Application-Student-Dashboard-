package student.dashboard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.StudyMaterial;

public interface StudyMaterialRepository extends JpaRepository<StudyMaterial, Long>{

}
