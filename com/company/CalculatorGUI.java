package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    JFrame calcFrame;
    JTextArea display1;
    String s0="", s1="", s2 = "";

    public CalculatorGUI() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {     // If Nimbus is not available, you can set the GUI to another look and feel. }
            e.printStackTrace();
        }
        calcFrame = new JFrame();
        calcFrame.setTitle("AUT Calculator");
        calcFrame.setSize(400, 400);
        calcFrame.setLocation(100, 200);
        calcFrame.setLayout(new BorderLayout());
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane1 = new JTabbedPane();


//        calcFrame.setLayout(new JTabbedPane , BorderLayout.WEST);
        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setSize(200, 200);
//        keyboardPanel.setLocation(10, 150);
        keyboardPanel.setLayout(new GridLayout(4, 3));
        //calcFrame.add(keyboardPanel, BorderLayout.CENTER);
        for (int i = 9; i > 0; i--) {
            JButton btn = new JButton();
            btn.setText("" + i);
            btn.setActionCommand("" + i);
            btn.addActionListener(new actionButton());
            keyboardPanel.add(btn);
        }
        JButton zeroBtn = new JButton();
        zeroBtn.setText("0");
        zeroBtn.setActionCommand("0");
        zeroBtn.addActionListener(new actionButton());
        keyboardPanel.add(zeroBtn);
        JButton dotBtn = new JButton();
        dotBtn.setText(".");
        dotBtn.setActionCommand(".");
        dotBtn.addActionListener(new actionButton());
        keyboardPanel.add(dotBtn);
        JButton equalBtn = new JButton();
        equalBtn.setText("=");
        equalBtn.setActionCommand("=");
        equalBtn.addActionListener(new actionButton());
        keyboardPanel.add(equalBtn);
        JPanel amaliat = new JPanel();
        amaliat.setLayout(new GridLayout(5, 1));
        JButton btm1 = new JButton("C");
        btm1.setActionCommand("C");
        btm1.addActionListener(new actionButton());
        amaliat.add(btm1);
        JButton btm2 = new JButton("/");
        btm2.setActionCommand("/");
        btm2.addActionListener(new actionButton());
        amaliat.add(btm2);
        JButton btm3 = new JButton("*");
        btm3.setActionCommand("*");
        btm3.addActionListener(new actionButton());
        amaliat.add(btm3);
        JButton btm4 = new JButton("-");
        btm4.setActionCommand("-");
        btm4.addActionListener(new actionButton());
        amaliat.add(btm4);
        JButton btm5 = new JButton("+");
        btm5.setActionCommand("+");
        btm5.addActionListener(new actionButton());
        amaliat.add(btm5);
        display1 = new JTextArea(3, 10);
        display1.setEditable(true);
        //display.setBackground(new Color(255, 0, 0));
        display1.setForeground(Color.BLACK);
        display1.setFont(new Font("Arial", 14, 14));

//        calcFrame.add(display);
//        display.setVisible(true);
        JScrollPane scrollPane = new JScrollPane(display1);
//        scrollPane.setSize(200,200);
        scrollPane.setPreferredSize(new Dimension(200, 100));
        scrollPane.setBackground(new Color(0, 0, 255));
        //scrollPane.setLocation(50,20);

//        calcFrame.add(scrollPane, BorderLayout.NORTH);
        scrollPane.setVisible(true);

        JPanel panelFrame = new JPanel();
        panelFrame.setLayout(new BorderLayout());
        panelFrame.add(keyboardPanel, BorderLayout.CENTER);
//        calcFrame.add(scrollPane, BorderLayout.NORTH);
        panelFrame.add(amaliat, BorderLayout.EAST);
//        calcFrame.add(display, BorderLayout.NORTH);
        calcFrame.getContentPane().add(scrollPane, BorderLayout.NORTH);
//        calcFrame.add(display, BorderLayout.CENTER);
        tabbedPane1.add(panelFrame);
        calcFrame.add(tabbedPane1);


        //scientific
        //  JTabbedPane tabbedPane2 = new JTabbedPane();
        JPanel amaliatM = new JPanel();
        JPanel keyboardPanel2 = new JPanel();
        keyboardPanel2.setLayout(new GridLayout(4, 3));
        for (int i = 9; i > 0; i--) {
            JButton btn2 = new JButton();
            btn2.setText("" + i);
            btn2.setActionCommand("" + i);
            btn2.addActionListener(new actionButton());
            keyboardPanel2.add(btn2);
        }
        JButton zeroBtn2 = new JButton();
        zeroBtn2.setText("0");
        zeroBtn2.setActionCommand("0");
        zeroBtn2.addActionListener(new actionButton());
        keyboardPanel2.add(zeroBtn2);
        JButton dotBtn2 = new JButton();
        dotBtn2.setText(".");
        dotBtn2.setActionCommand(".");
        dotBtn2.addActionListener(new actionButton());
        keyboardPanel2.add(dotBtn2);
        JButton equalBtn2 = new JButton();
        equalBtn2.setText("=");
        equalBtn2.setActionCommand("=");
        equalBtn2.addActionListener(new actionButton());
        keyboardPanel2.add(equalBtn2);

        amaliatM.setLayout(new GridLayout(6, 2));
        JButton btm13 = new JButton("C");
        btm13.setActionCommand("C");
        btm13.addActionListener(new actionButton());
        JButton btm14 = new JButton("/");
        btm14.setActionCommand("/");
        btm14.addActionListener(new actionButton());
        JButton btm15 = new JButton("*");
        btm15.setActionCommand("*");
        btm15.addActionListener(new actionButton());
        JButton btm16 = new JButton("-");
        btm16.setActionCommand("-");
        btm16.addActionListener(new actionButton());
        JButton btm17 = new JButton("+");
        btm17.setActionCommand("+");
        btm17.addActionListener(new actionButton());
        JButton btm6 = new JButton("tg");
        btm6.setActionCommand("tg");
        btm6.addActionListener(new actionButton());
        JButton btm7 = new JButton("sin");
        btm7.setActionCommand("sin");
        btm7.addActionListener(new scientificCalc());
        JButton btm8 = new JButton("log");
        btm8.setActionCommand("log");
        btm8.addActionListener(new actionButton());
        JButton btm9 = new JButton("e");
        btm9.setActionCommand("e");
        btm9.addActionListener(new actionButton());
        JButton btm10 = new JButton("PI");
        btm10.setActionCommand("PI");
        btm10.addActionListener(new actionButton());
        JButton btm11 = new JButton("Shift");
        btm11.setActionCommand("Shift");
        btm11.addActionListener(new actionButton());
        JButton btm12 = new JButton("%");
        btm12.setActionCommand("%");
        btm12.addActionListener(new actionButton());
        amaliatM.add(btm13);
        amaliatM.add(btm11);
        amaliatM.add(btm17);
        amaliatM.add(btm7);
        amaliatM.add(btm16);
        amaliatM.add(btm6);
        amaliatM.add(btm14);
        amaliatM.add(btm8);
        amaliatM.add(btm15);
        amaliatM.add(btm12);
        amaliatM.add(btm10);
        amaliatM.add(btm9);
        JPanel scientific = new JPanel(new BorderLayout());
        scientific.add(amaliatM, BorderLayout.EAST);
        scientific.add(keyboardPanel2, BorderLayout.CENTER);
        tabbedPane1.add(scientific);

        calcFrame.setVisible(true);

    }

    public class actionButton implements ActionListener {

        public void actionPerformed(ActionEvent e)
        {
            String s = e.getActionCommand();

            // if the value is a number
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                // if operand is present then add to second no
                if (!s1.equals(""))
                    s2 = s2 + s;
                else
                    s0 = s0 + s;

                // set the value of text
                display1.setText(s0 + s1 + s2);
            }
            else if (s.charAt(0) == 'C') {
                // clear the one letter
                s0 = s1 = s2 = "";

                // set the value of text
                display1.setText(s0 + s1 + s2);
            }
            else if (s.charAt(0) == '=') {

                double te;

                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                // set the value of text
                display1.setText(s0 + s1 + s2 + "=" + te);

                // convert it to string
                s0 = Double.toString(te);

                s1 = s2 = "";
            }
            else {
                // if there was no operand
                if (s1.equals("") || s2.equals(""))
                    s1 = s;
                    // else evaluate
                else {
                    double te;

                    // store the value in 1st
                    if (s1.equals("+"))
                        te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                    else if (s1.equals("-"))
                        te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                    else if (s1.equals("/"))
                        te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                    else
                        te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                    // convert it to string
                    s0 = Double.toString(te);

                    // place the operator
                    s1 = s;

                    // make the operand blank
                    s2 = "";
                }

                // set the value of text
                display1.setText(s0 + s1 + s2);
            }
            if(s.substring(0, 2).equals("sin")){
                s0 = "sin";
                display1.setText("" + Math.sin(Double.parseDouble(s.substring(3, 3))));
            }
        }

    }



    private class scientificCalc implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("sin")){
                display1.setText("sin");
            }
        }
    }
}


