package entities;

import java.util.StringJoiner;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent_Of_increase) {
        salary += salary * 100 / percent_Of_increase;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + salary;
    }
}