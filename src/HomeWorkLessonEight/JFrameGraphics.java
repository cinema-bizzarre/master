package HomeWorkLessonEight;

import javax.swing.*;
import java.awt.*;

public class JFrameGraphics extends JPanel {

    @Override
    public void paint(Graphics g){
        Color nightSky = new Color(6, 15, 83);
        g.setColor(nightSky);
        g.fillRect(0,0,600,150);

        Color land = new Color(50, 22, 3);
        g.setColor(land);
        g.fillRect(0,150,600,250);

        Color moon = new Color(234, 222, 150);
        g.setColor(moon);
        g.fillOval(20,20,60,60);

        Color roof = new Color(21, 196, 15);
        g.setColor(roof);
       g.fillPolygon(new int[] {180,250,300}, new int[] {180,90,180}, 3);

        Color windowRoof = new Color(91, 16, 120);
        g.setColor(windowRoof);
        g.fillOval(230,140,20,20);

        Color house = new Color(50, 217, 149);
        g.setColor(house);
        g.fillRect(180,180,120,120);

        Color door = new Color(154, 26, 177);
        g.setColor(door);
        g.fillRect(250,250,30,50);

        Color window = new Color(210, 202, 14);
        g.setColor(window);
        g.fillRect(200,230,30,30);


    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Welcome to Duke Nukem");
        frame.getContentPane().add(new JFrameGraphics());
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

}
