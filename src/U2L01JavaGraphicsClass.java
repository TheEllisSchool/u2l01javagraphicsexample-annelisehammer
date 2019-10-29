import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class U2L01JavaGraphicsClass extends JPanel {
	
	
	public static void main(String[] args) {
		//creating the window
		JFrame frame = new JFrame("Canvas");
		//being able to close the window using the x button
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    U2L01JavaGraphicsClass panel = new U2L01JavaGraphicsClass();
	    
	    frame.add(panel);

	    frame.setSize(400, 400);
	    frame.setVisible(true);

	}
	
	public void paintComponent(Graphics g){
		Color barney = new Color (220, 125, 255);
		
		g.setColor(barney);
		g.fillOval(200,100,400,400);
		
		
		g.setFont(new Font ("Arial", Font.BOLD, 100));
		g.setColor(Color.WHITE);
		g.drawString("A+", 350, 320);
		
		g.setColor(Color.WHITE);
		g.fillOval(380,350,40,40);
		
		g.drawArc(350,370,50,30,200,180);
		g.drawArc(400,370,50,30,180,180);
		
		g.setFont(new Font ("Arial", Font.BOLD, 40));
		g.setColor(Color.WHITE);
		g.drawString("Gaming", 330, 440);
		//g.drawOval(50, 50, 50, 50);
		//g.drawLine(0,0,50,50);      
		//g.setColor(barney);
		//g.drawLine(50,0,50,75);
		
		//g.setFont(new Font("Arial", Font.BOLD, 32));
		//g.drawString("CS Rocks", 50, 100);
	}

}
