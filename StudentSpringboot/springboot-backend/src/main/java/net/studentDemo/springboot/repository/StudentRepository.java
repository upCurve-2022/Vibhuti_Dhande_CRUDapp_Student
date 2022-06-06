package net.studentDemo.springboot.repository;

import net.studentDemo.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // all crud database methods
}


