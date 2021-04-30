package br.com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
