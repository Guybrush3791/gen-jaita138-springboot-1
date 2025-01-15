package org.generation.jaita138.demo4.db.repo;

import org.generation.jaita138.demo4.db.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo
    extends JpaRepository<Employee, Long> {

}
