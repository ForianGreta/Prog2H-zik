/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat5;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gréta
 */
public class szamologep extends JFrame implements ActionListener {

    private JTextField tf;

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    private JButton b16;
    private JButton b17;
    private JButton b18;
    private JButton b19;
    private JButton b20;
    private JButton b21;
    private JButton b22;
    private JButton b23;
    private JButton b24;
    private JButton b25;
    private JButton b26;
    private JButton b27;
    private JButton b28;

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;

    public szamologep() throws HeadlessException {
        super("számológép");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf = new JTextField(30);
        b1 = new JButton("");
        b2 = new JButton("Backspace");
        b3 = new JButton("CE");
        b4 = new JButton("C");
        b5 = new JButton("MC");
        b6 = new JButton("7");
        b7 = new JButton("8");
        b8 = new JButton("9");
        b9 = new JButton("/");
        b10 = new JButton("sqrt");
        b11 = new JButton("MR");
        b12 = new JButton("4");
        b13 = new JButton("5");
        b14 = new JButton("6");
        b15 = new JButton("*");
        b16 = new JButton("%");
        b17 = new JButton("MS");
        b18 = new JButton("1");
        b19 = new JButton("2");
        b20 = new JButton("3");
        b21 = new JButton("-");
        b22 = new JButton("1/x");
        b23 = new JButton("M+");
        b24 = new JButton("0");
        b25 = new JButton("+/-");
        b26 = new JButton(".");
        b27 = new JButton("+");
        b28 = new JButton("=");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();

        GridLayout gr1 = new GridLayout(1, 1);
        p1.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1, 4);
        p2.setLayout(gr2);
        GridLayout gr3 = new GridLayout(1, 6);
        p3.setLayout(gr3);
        GridLayout gr4 = new GridLayout(1, 6);
        p4.setLayout(gr4);
        GridLayout gr5 = new GridLayout(1, 6);
        p5.setLayout(gr5);
        GridLayout gr6 = new GridLayout(1, 6);
        p6.setLayout(gr6);
        GridLayout gr7 = new GridLayout(6, 1);
        p7.setLayout(gr7);

        p1.add(tf);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p3.add(b5);
        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(b10);
        p4.add(b11);
        p4.add(b12);
        p4.add(b13);
        p4.add(b14);
        p4.add(b15);
        p4.add(b16);
        p5.add(b17);
        p5.add(b18);
        p5.add(b19);
        p5.add(b20);
        p5.add(b21);
        p5.add(b22);
        p6.add(b23);
        p6.add(b24);
        p6.add(b25);
        p6.add(b26);
        p6.add(b27);
        p6.add(b28);
        p7.add(p1);
        p7.add(p2);
        p7.add(p3);
        p7.add(p4);
        p7.add(p5);
        p7.add(p6);

        this.add(p7);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);

        pack();
    }

    public static void main(String[] args) {
        szamologep a = new szamologep();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b6) {
            tf.setText(tf.getText() + Integer.toString(7));
        }
        if (e.getSource() == b7) {
            tf.setText(tf.getText() + Integer.toString(8));
        }
        if (e.getSource() == b8) {
            tf.setText(tf.getText() + Integer.toString(9));
        }
        if (e.getSource() == b12) {
            tf.setText(tf.getText() + Integer.toString(4));
        }
        if (e.getSource() == b13) {
            tf.setText(tf.getText() + Integer.toString(5));
        }
        if (e.getSource() == b14) {
            tf.setText(tf.getText() + Integer.toString(6));
        }
        if (e.getSource() == b18) {
            tf.setText(tf.getText() + Integer.toString(1));
        }
        if (e.getSource() == b19) {
            tf.setText(tf.getText() + Integer.toString(2));
        }
        if (e.getSource() == b20) {
            tf.setText(tf.getText() + Integer.toString(3));
        }
        if (e.getSource() == b24) {
            tf.setText(tf.getText() + Integer.toString(0));
        }
        if (e.getSource() == b27) {
            tf.setText(tf.getText() + "+");
        }
        if (e.getSource() == b28) {
            String s = tf.getText();

            tf.setText(szamol(s));
        }
    }

    public String szamol(String s) {
        String[] st = s.split("\\+");
        int a = 0;
        for (int i = 0; i < st.length; i++) {
            a += Integer.parseInt(st[i]);
        }
        return Integer.toString(a);
    }
}
