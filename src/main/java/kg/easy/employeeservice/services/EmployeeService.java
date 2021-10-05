package kg.easy.employeeservice.services;


import kg.easy.employeeservice.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> findAll();

    Employee findById(Long id);
}
