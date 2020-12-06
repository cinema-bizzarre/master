package HomeWorkLessonEight;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyWindow extends JFrame {

    public MyWindow()
    {
        super("Кнопки");
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        Container container = getContentPane();
        container.setLayout(new FlowLayout( FlowLayout.LEFT, 50, 50));

        JButton button = new JButton("Обычная кнопка");

        button.addActionListener(new ListenerAction());
        button.addChangeListener(new ListenerChange());

        button.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                System.out.println("Это событие мы не увидим");
            }});
        container.add(button);


        button = new JButton("<html><h2><font color=\"green\"> Оранжевая кнопка");
        button.setBackground(Color.orange);
        button.addActionListener(new ListenerAction());
        button.addChangeListener(new ListenerChange());
        container.add(button);

        button = new JButton("Выключено");
        button.setEnabled(false);
        container.add(button);

        setSize(300, 300);
        setVisible(true);
    }
    class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Нажатие кнопки: "+ e.getActionCommand() + "\n");

        }
    }
    class ListenerChange implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            Object src = e.getSource();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new MyWindow();
    }

}

