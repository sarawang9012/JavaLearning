package com.learning.java.interfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * ClassName: TimePrinter
 * Package: com.learning.java.interfaces
 * Description:
 *
 * @Author Sara Wang
 * @Create 2023/8/18 16:21
 * @Version 1.0
 */
class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
