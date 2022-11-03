package pl.com.britenet.praktyki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.britenet.praktyki.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
