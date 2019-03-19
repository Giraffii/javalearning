package lesson07;

import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class prog1_7 {

	public static void main(String[] args) {
		
		MainFrame window = new MainFrame ();
	}

}
class MainPanel extends JPanel {
	private int x,y,z;
	private int direction = 2;
	private Image image;
	
	private class MainKey implements KeyListener {
		
		@Override
		public void keyPressed (KeyEvent arg0) {
			int code = arg0.getKeyCode();
			System.out.println(code);
			if (code == 37) { direction = 0; } //LEFT
			if (code == 38) { direction = 1; } //UP
			if (code == 39) { direction = 2; } //RIGHT
			if (code == 40) { direction = 3; } //DOWN
		}
		@Override
		public void keyReleased (KeyEvent e) {}
		@Override
		public void keyTyped(KeyEvent e) {}
	}
	
	public MainPanel () {
		x=300;
		y=300;
		z=300;
		addKeyListener(new MainKey());
		setFocusable(true);
		try {
			image = ImageIO.read(new File ("src\\lesson07\\earth.jpg"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Timer timer = new Timer (100, new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (direction == 0) x--;
				if (direction == 1) {
					
					z=z+5;
				}
				if (direction == 2) x++;
				if (direction == 3) {
					
					z=z-5;
				}
				repaint();
			}
		});
		timer.start();
	}
	public void paintComponent(Graphics graphics) {
		graphics.clearRect(x-z/2-1, y-z/2-1, z+1, z+1);
		graphics.drawImage(image, x-z/2, y-z/2, z, z, null);
	}
}

class MainFrame extends JFrame {
	public MainFrame () {
		MainPanel panel = new MainPanel ();
		Container container = getContentPane ();
		container.add (panel);
		this.setBounds (200, 200, 800, 600);
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