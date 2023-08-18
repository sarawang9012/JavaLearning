package com.learning.java.interfaces;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Package: com.learning.java.interfaces
 * Description:
 *
 * @Author Sara Wang
 * @Create 2023/8/18 16:29
 * @Version 1.0
 */
public class ComparatorTest {
    @Test
    public void test1() {
        String[] names = {"Ann", "Ed", "Lily", "Sara Wang"};
        LengthComparator myComparator = new LengthComparator();
        System.out.println("Before sorting...");
        for (int i = 0; i < names.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(names[i]);
        }
        System.out.println();
        Arrays.sort(names, myComparator);
        System.out.println("After sorting...");
        for (int i = 0; i < names.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(names[i]);
        }
        System.out.println();

    }

}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
