package ro.dg.springh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.dg.springh2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
