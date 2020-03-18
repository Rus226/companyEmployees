package ru.ruslan.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private int id;
    private String passportNumber;
    private String fName;
    private String sName;
    private String position;
    private int salary;

    @ManyToOne
    private Department depart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepart() {
        return depart;
    }

    public void setDepart(Department depart) {
        this.depart = depart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                salary == employee.salary &&
                passportNumber.equals(employee.passportNumber) &&
                fName.equals(employee.fName) &&
                sName.equals(employee.sName) &&
                position.equals(employee.position) &&
                depart.equals(employee.depart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passportNumber, fName, sName, position, salary, depart);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                ", fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", depart=" + depart +
                '}';
    }
}
