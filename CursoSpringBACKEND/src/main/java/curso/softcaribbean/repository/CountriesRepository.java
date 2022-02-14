package curso.softcaribbean.repository;

import curso.softcaribbean.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, String> {

}
