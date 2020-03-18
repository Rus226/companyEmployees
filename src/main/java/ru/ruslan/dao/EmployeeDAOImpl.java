package ru.ruslan.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ruslan.model.Employee;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> fromAllDepartments() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee").list();
    }

    @Override
    public List<Employee> fromResearch() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee where depart_Id = 1").list();
    }

    @Override
    public List<Employee> fromMarketing() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee where depart_Id = 2").list();
    }

    @Override
    public List<Employee> fromDevelop() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee where depart_Id = 3").list();
    }

    @Override
    public List<Employee> fromTest() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee where depart_Id = 4").list();
    }

    @Override
    public List<Employee> fromBookkeeping() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee where depart_Id = 5").list();
    }

    @Override
    public List<Employee> fromTopManagers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee  where depart_Id = 6").list();
    }

    @Override
    public void add(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(employee);
    }

    @Override
    public void delete(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(employee);
    }

    @Override
    public void edit(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.update(employee);
    }

    @Override
    public Employee getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }
}
