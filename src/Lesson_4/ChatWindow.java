package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Java. Level 2. Lesson 4. Homework 4
 *
 * @author Olga Petrova
 * @version dated Dec 03, 2018
 */

public class ChatWindow extends JFrame {

    private JTextField jtf;
    private JTextArea jta;

    class HintTextField extends JTextField {
        String hint;

        public HintTextField(String hint) {
            this.hint = hint;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (getText().isEmpty())
                g.drawString(hint, 4, 18);
        }
    }

    public ChatWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        setBounds(700, 300, 400, 400);

        JButton jb = new JButton("Send");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        jtf = new HintTextField("Enter your message");
        jta = new JTextArea(10, 20);
        jta.setBackground(new Color(197, 233, 235));
        jta.setForeground (Color.blue);
        jta.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp);

        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMsg();
            }
        });

        JPanel lowerPanel = new JPanel(new BorderLayout());
        lowerPanel.add(jb, BorderLayout.EAST);
        lowerPanel.add(jtf, BorderLayout.CENTER);
        add(lowerPanel, BorderLayout.SOUTH);

        Font font = new Font("Arial", Font.PLAIN, 16);
        jta.setFont(font);

        JLabel jll = new JLabel("Chat #1");
        add(jll, BorderLayout.NORTH);

        setVisible(true);
        jtf.grabFocus();
    }

    public void sendMsg() {
        jta.append(jtf.getText() + "\n");
        jtf.setText("");
        jtf.grabFocus();
    }
}