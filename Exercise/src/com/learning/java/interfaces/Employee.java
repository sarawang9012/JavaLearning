package com.learning.java.interfaces;

/**
 * ClassName: Employee
 * Package: com.learning.java.interfaces
 * Description:
 *
 * @Author Sara Wang
 * @Create 2023/8/18 16:02
 * @Version 1.0
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     *
     * @param other another Employee object.
     * @return a negative value if this employee has a lower salary
     * than otherObject, 0 if the salaries are the same, a positive value
     * otherwise.
     */
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return "Employee{name:" + name + ", salary:" + salary + "}";
    }
}
