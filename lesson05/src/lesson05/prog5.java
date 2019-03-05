package lesson05;

import javax.swing.*;
import java.awt.*; 

public class prog5 {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		Animal monkey = new Animal();
		//monkey.mass = 15;
		monkey.setMass(15);
		System.out.println("Масса до еды " + monkey.getMass());
		for (int i = 0; i < 9; i++) {
			monkey.eat(15);
		}
		System.out.println("Масса после еды " + monkey.getMass());
//		MainFrame window1 = new MainFrame (800, 300);
		int x = 15;
		Integer xx = 12349;
		System.out.println(Integer.toBinaryString(xx));
	}

}

class MainPanel extends JPanel {
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		graphics.setColor(Color.RED);
		graphics.fillRect(50, 50, 200, 100);
		graphics.setColor(Color.ORANGE);
		graphics.draw3DRect(300, 100, 200, 50, false);
		Color currentColor = new Color (0.7f, 0.7f, 0.7f, 0.3f);
		graphics.setColor(currentColor);
		graphics.drawLine(0, 0, 500, 500);
	}
}

class MainFrame extends JFrame{
	public MainFrame () {
		MainPanel panel = new MainPanel ();
		Container container = getContentPane ();
		container.add (panel);
		this.setBounds (200, 200, 600, 400);
		setVisible (true);
	}	
	public MainFrame(int x, int y) {
		MainPanel panel = new MainPanel ();
		Container container = getContentPane ();
		container.add (panel);
		this.setBounds (x, y, 800, 600);
		setVisible (true);
	}
}
class Animal {
	private int mass;
	
	protected void eat() {
		mass++;
	}
	
	protected void eat (int mass) {
		this.mass = this.mass + mass;
	}
	
	public int getMass() {
		return mass;
	}
	
	public void setMass(int someMass) {
		mass = someMass;
	}
}