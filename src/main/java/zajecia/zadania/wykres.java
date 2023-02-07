/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rpezd
 */
class RysunekObrazy extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        setBackground(Color.WHITE);
        Image obraz = Toolkit.getDefaultToolkit().getImage("D:\\Zadania\\Java\\Zadania\\akyxxw.png");
        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage(obraz, 0);
        g.drawImage(obraz, 0, 0, 510, 297, null);
        int b=-4;
        int a=2;
        int x=b/a;
        int b1=b*23;
        int x1=x*40;
        g.drawLine(247+x1, 150, 247, 150+(-b1));
        try {
            tracker.waitForAll();
        } catch (InterruptedException w) {
        }
    }
}

class RamkaObrazy extends JFrame {

    public RamkaObrazy() {
        setTitle("Wykres");
        RysunekObrazy rysunek = new RysunekObrazy();
        getContentPane().add(rysunek);
    }

}

public class wykres {

    public static void main(String[] args) {
        RamkaObrazy ramka = new RamkaObrazy();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLocation(200, 150);
        ramka.setSize(510, 297);
        ramka.setVisible(true);
    }
}