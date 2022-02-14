package curso.softcaribbean.repository;

import curso.softcaribbean.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepostiory extends JpaRepository<Departments, Long> {
}
