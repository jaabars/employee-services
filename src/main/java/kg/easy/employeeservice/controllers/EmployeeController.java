package kg.easy.employeeservice.controllers;

import kg.easy.employeeservice.models.Employee;
import kg.easy.employeeservice.services.EmployeeService;
import kg.easy.employeeservice.services.impl.EmployeeServiceImpl;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping("/get")
    public List<Employee> getEmployeeList(){
        return employeeService.findAll();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.findById(id);
    }
}
