package com.learning.java.interfaces;

import org.junit.Test;

import javax.swing.*;

/**
 * ClassName: TimerTest
 * Package: com.learning.java.interfaces
 * Description:
 *
 * @Author Sara Wang
 * @Create 2023/8/18 16:23
 * @Version 1.0
 */
public class TimerTest {
    @Test
    public void test1() {
        var listener = new TimePrinter();
        //construct a timer that calls the listener
        //once every second
        var timer = new Timer(1000, listener);
        timer.start();

        //keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}
