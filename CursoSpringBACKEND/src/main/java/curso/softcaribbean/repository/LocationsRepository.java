package curso.softcaribbean.repository;

import curso.softcaribbean.model.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationsRepository extends JpaRepository<Locations,Long> {
}
