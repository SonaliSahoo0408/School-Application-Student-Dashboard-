package student.dashboard.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import student.dashboard.Model.Route;

public interface RouteRepository extends JpaRepository<Route, Long>{
	Optional<Route> findFirstByActiveTrue();
}
