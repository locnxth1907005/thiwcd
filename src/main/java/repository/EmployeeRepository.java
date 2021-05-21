package repository;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    public static List<Employee> list = new ArrayList<>();
    public boolean save(Employee employee){
        list.add(employee);
        return true;
    }
    public List<Employee> findAll(){
        return list;
    }
}
