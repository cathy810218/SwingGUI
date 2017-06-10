package com.codefellows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

/**
 * Created by cathyoun on 6/10/17.
 */
public class SwingDemo {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel statusLabel;
    public SwingDemo() {
        //create a window
        mainFrame = new JFrame("CodeFellows Swing Demo");
        mainFrame.setBounds(0,0,500,500);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new GridLayout(3,1));


//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("HI You're closing me");
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JButton okayButton = new JButton("Okay");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        controlPanel.add(okayButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);


        // Labels
        JLabel headerLabel = new JLabel("header", JLabel.CENTER);
        statusLabel = new JLabel("status", JLabel.CENTER);
//        statusLabel.setSize(350, 500);
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);

        okayButton.setActionCommand("Okay");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okayButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(e -> {
            statusLabel.setText("Cancel button click Lambda");
        });

        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Okay")) {
                statusLabel.setText("Okay button clicked");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit button clicked");
            } else {
                statusLabel.setText("");
            }
        }
    }

}
