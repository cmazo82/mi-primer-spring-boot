package curso.softcaribbean.repository;

import curso.softcaribbean.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {

}
