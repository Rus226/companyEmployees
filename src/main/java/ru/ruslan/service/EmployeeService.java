package ru.ruslan.service;

import ru.ruslan.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> fromAllDepartments();
    List<Employee> fromResearch();
    List<Employee> fromMarketing();
    List<Employee> fromDevelop();
    List<Employee> fromTest();
    List<Employee> fromBookkeeping();
    List<Employee> fromTopManagers();
    void add(Employee employee);
    void delete(Employee employee);
    void edit(Employee employee);
    Employee getById(int id);
}
