package kg.easy.employeeservice.services.impl;

import kg.easy.employeeservice.models.Employee;
import kg.easy.employeeservice.repository.EmployeeRepository;
import kg.easy.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {

        return employeeRepository.findById(id).get();
    }
}
