package HomeWorkLessonEight;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClass extends JFrame {

    public MouseClass(){
        setTitle("Работа с мышью");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,800,500);

       JPanel panel = new JPanel();
       add(panel);
       panel.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseReleased(MouseEvent e) {
               int globalX = e.getXOnScreen();
               int globalY = e.getYOnScreen();
               System.out.println(" Позиция мыши: (" + globalX + ", " + globalY + ')');
           }
       });


        setVisible(true);


    }


    public static void main(String[] args){
        MouseClass mouseClass = new MouseClass();

    }


}
