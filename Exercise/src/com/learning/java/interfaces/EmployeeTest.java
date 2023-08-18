package com.learning.java.interfaces;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: EmployeeTest
 * Package: com.learning.java.interfaces
 * Description:
 *
 * @Author Sara Wang
 * @Create 2023/8/18 16:09
 * @Version 1.0
 */
public class EmployeeTest {
    @Test
    public void test1() {
        Employee[] emps = new Employee[3];
        emps[0] = new Employee("Tom", 32000);
        emps[1] = new Employee("Sara", 20000);
        emps[2] = new Employee("Lily", 25000);
        System.out.println("Before sorting...");
        for (Employee emp : emps) {
            System.out.println(emp.toString());
        }
        Arrays.sort(emps);
        System.out.println("After sorting...");

        for (Employee emp : emps) {
            System.out.println(emp.toString());
        }
    }
}
