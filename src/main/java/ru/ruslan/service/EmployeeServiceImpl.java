package ru.ruslan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ruslan.dao.EmployeeDAO;
import ru.ruslan.model.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> fromAllDepartments() {
        return employeeDAO.fromAllDepartments();
    }

    @Override
    @Transactional
    public List<Employee> fromResearch() {
        return employeeDAO.fromResearch();
    }

    @Override
    @Transactional
    public List<Employee> fromMarketing() {
        return employeeDAO.fromMarketing();
    }

    @Override
    @Transactional
    public List<Employee> fromDevelop() {
        return employeeDAO.fromDevelop();
    }

    @Override
    @Transactional
    public List<Employee> fromTest() {
        return employeeDAO.fromTest();
    }

    @Override
    @Transactional
    public List<Employee> fromBookkeeping() {
        return employeeDAO.fromBookkeeping();
    }

    @Override
    @Transactional
    public List<Employee> fromTopManagers() {
        return employeeDAO.fromTopManagers();
    }

    @Override
    @Transactional
    public void add(Employee employee) {
        employeeDAO.add(employee);
    }

    @Override
    @Transactional
    public void delete(Employee employee) {
        employeeDAO.delete(employee);
    }

    @Override
    @Transactional
    public void edit(Employee employee) {
        employeeDAO.edit(employee);
    }

    @Override
    @Transactional
    public Employee getById(int id) {
        return employeeDAO.getById(id);
    }
}
