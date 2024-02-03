package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
