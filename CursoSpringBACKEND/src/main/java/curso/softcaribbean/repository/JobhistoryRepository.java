package curso.softcaribbean.repository;

import curso.softcaribbean.model.Jobhistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobhistoryRepository extends JpaRepository<Jobhistory, Long> {
}
