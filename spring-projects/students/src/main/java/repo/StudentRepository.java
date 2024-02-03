package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(Integer schoolId);
}
