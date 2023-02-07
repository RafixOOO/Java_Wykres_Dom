/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania;

/**
 *
 * @author rpezd
 */
import java.awt.*; 
import javax.swing.*;


class Rysunek extends JPanel
{
	public void paintComponent(Graphics g)
	{			  
	  super.paintComponent(g);	  	  
	  setBackground(Color.BLUE);
          g.setColor(Color.green);
	  g.fillRect(0, 175, 300, 50);
          g.setColor(Color.orange);
	  g.fillRect(125, 100, 80, 80);
          g.setColor(Color.blue);
	  g.fillRect(140, 120, 10, 10);
          g.setColor(Color.blue);
	  g.fillRect(180, 120, 10, 10);
          Color brown = new Color(102,51,0);
          g.setColor(brown);
	  g.fillRect(153, 145, 25, 35);
          int[] x1 = {115, 165, 220};
          int[] y1 = {100, 50, 100};
          g.setColor(Color.red);
          g.fillPolygon(x1, y1, 3);
          g.setColor(brown);
	  g.fillRect(40, 120, 25, 60);
          g.setColor(Color.GREEN);
          g.fillOval(32, 65, 40, 60);
          g.setColor(Color.yellow);
          g.fillArc(260, -20, 60, 40, 0, -200);
          g.setColor(Color.yellow);
          g.drawLine(300, -10, 200, 20);
          g.setColor(Color.yellow);
          g.drawLine(300, -10, 200, 50);
          g.setColor(Color.yellow);
          g.drawLine(300, 0, 220, 80);
          
	}
}


class Ramka extends JFrame 
{
	public Ramka()
	{
		setTitle("Dom");
		Rysunek rysunek = new Rysunek();
		getContentPane().add(rysunek);		
	}
	
}
 	
public class dom
{
 
  public static void main ( String[] args )
  {
    Ramka ramka = new Ramka() ;
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                     
    ramka.setLocation(200,150);    
    ramka.setSize( 300, 250 );         
    ramka.setVisible( true );      
  }
}