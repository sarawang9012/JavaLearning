package com.learning.java.interfaces.clone;

import org.junit.Test;

/**
 * ClassName: CloneTest
 * Package: com.learning.java.interfaces.clone
 * Description:
 *
 * @Author Sara Wang
 * @Create 2023/8/18 17:19
 * @Version 1.0
 */
public class CloneTest {
    @Test
    public void test1() throws CloneNotSupportedException {
        var original = new Employee("John Q. Public", 50000);
        original.setHireDay(2023, 8, 18);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2021, 7, 31);
        System.out.println("original:" + original);
        System.out.println("copy" + copy);

    }
}
