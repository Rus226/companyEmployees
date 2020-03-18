package ru.ruslan.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.ruslan.model.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Department getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Department.class, id);
    }
}
