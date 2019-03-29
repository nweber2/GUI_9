package frames;

/**
 *
 * @author nicho
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import utiliities.Random;

/**
 *
 * @author nicho
 */
public class KFrame9 extends JFrame implements ActionListener {

    JTextArea reflector;
    JButton term;
    JButton quote;
    JButton person;
    JButton language;
    JButton colorButton;
    JButton clear;
    JTextField input;

    public KFrame9(String title) {
        super(title);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(getContentPane());
        addListeners();
        setVisible(true);
        reflector.setLineWrap(true);
    }

    private void addComponents(Container contentPane) {
        term = new JButton("Term");
        quote = new JButton("Quote");
        person = new JButton("Person");
        language = new JButton("Language");
        colorButton = new JButton("Color");
        clear = new JButton("Clear");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(term);
        controlPanel.add(quote);
        controlPanel.add(person);
        controlPanel.add(language);
        controlPanel.add(clear);
        controlPanel.add(colorButton);
        reflector = new JTextArea();
        input = new JTextField();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(reflector, BorderLayout.CENTER);
        contentPane.add(input, BorderLayout.SOUTH);
    }

    private void addListeners() {
        term.addActionListener(this);
        quote.addActionListener(this);
        person.addActionListener(this);
        language.addActionListener(this);
        clear.addActionListener(this);
        colorButton.addActionListener(this);
        input.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (event.getSource() instanceof JTextField) {
            input.setText("");
        }
        for (int s = 0; s < 10; s++) {
            if (command.equalsIgnoreCase("Term")) {
                reflector.append(Random.term());
            } else if (command.equalsIgnoreCase("Quote")) {
                reflector.append(Random.quote());
            } else if (command.equalsIgnoreCase("Person")) {
                reflector.append(Random.people());
            } else if (command.equalsIgnoreCase("Language")) {
                reflector.append(Random.language());
            } else if (command.equalsIgnoreCase("Color")) {
                reflector.setBackground(Random.color());
            } else if (command.equalsIgnoreCase("Clear")) {
                reflector.setBackground(Color.WHITE);
                reflector.setText("");
            }
        }
    }

}
