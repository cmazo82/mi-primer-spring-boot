package curso.softcaribbean.repository;

import curso.softcaribbean.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
