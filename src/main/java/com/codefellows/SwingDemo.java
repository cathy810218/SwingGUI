package com.codefellows;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cathyoun on 6/10/17.
 */
public class SwingDemo {
    private JFrame mainFrame;

    public SwingDemo() {
        //create a window
        mainFrame = new JFrame("CodeFellows Swing Demo");
        mainFrame.setVisible(true);
        mainFrame.setBounds(0,0,500,500);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new GridLayout(3,1));
    }
}
