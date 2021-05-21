package service;

import entity.Employee;
import repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = new EmployeeRepository();
    }

    public boolean create(Employee employee) {

        return employeeRepository.save(employee);

    }
    public List<Employee> getList() {
        return new ArrayList<>();
    }

}
