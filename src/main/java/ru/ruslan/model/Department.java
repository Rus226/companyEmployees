package ru.ruslan.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private int id;

    @Column (name = "NameDepartment")
    private String nameDep;

    @Column (name = "Location")
    private String location;

    @OneToMany (mappedBy = "depart")
    private List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDep() {
        return nameDep;
    }

    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", nameDep='" + nameDep + '\'' +
                ", location='" + location + '\'' +
                ", employees=" + employees +
                '}';
    }
}
