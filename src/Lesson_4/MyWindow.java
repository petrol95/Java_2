package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow extends JFrame {

    private JTextField jtf;
    private JTextArea jta;

    public MyWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Application");
        setBounds(700, 300, 400, 400);
//        setLayout(new FlowLayout());
//        setLayout(null);

        JButton jb1 = new JButton("Button #1");
        JButton jb2 = new JButton("Button #2");
//        jb1.setPreferredSize(new Dimension(50, 40));
//        add(jb1, BorderLayout.NORTH);
//        add(jb2, BorderLayout.SOUTH);
//        jb1.setBounds(10, 10, 50, 50);
//        jb2.setBounds(30, 30, 100, 20);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        jtf = new JTextField(20);
        jta = new JTextArea(10, 20);
        jta.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp);
//        add(jtf);

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyWindow.this.sendMsg();
            }
        });
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyWindow.this.sendMsg();
            }
        });

        JPanel upperPanel = new JPanel(new BorderLayout());
        upperPanel.add(jb1, BorderLayout.WEST);
        upperPanel.add(jb2, BorderLayout.EAST);
        upperPanel.add(jtf, BorderLayout.CENTER);
        add(upperPanel, BorderLayout.NORTH);

        JButton jbWarning = new JButton("Warning");
        jbWarning.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "WARNING!!!");
//                JOptionPane.showInputDialog(null, "Here is your value", "10");
                JOptionPane.showOptionDialog(null, "msg", "title",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        new Object[] {"A", "C", "D"}, "A");
            }
        });
        jbWarning.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                jbWarning.setBackground(new Color((int)((float)e.getX() / (float)jbWarning.getWidth() * 255f),
                        0, 0));
            }
        });
        add(jbWarning, BorderLayout.SOUTH);

        Font font = new Font("Arial", Font.PLAIN, 24);
        jta.setFont(font);


//        for (int i = 0; i < 50; i++) {
//            JButton jb = new JButton("#" + i);
//            jb.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    System.out.println("X");
//                }
//            });
//            add(jb);
//        }

        setVisible(true);
    }

    public void sendMsg() {
        jta.append(jtf.getText() + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}
