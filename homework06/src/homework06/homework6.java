package homework06;

import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class homework6 {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		
		MainFrame window = new MainFrame ();
	}

}
class MainPanel extends JPanel {
	private int x,y;
	private int direction = 2;
	private Image image;
	
	private class MainKey implements KeyListener {
		
		@Override
		public void keyPressed (KeyEvent arg0) {
			int code = arg0.getKeyCode();
			if (code == 37) { direction = 0; }
			if (code == 38) { direction = 1; }
			if (code == 39) { direction = 2; }
			if (code == 40) { direction = 3; }
		}
		@Override
		public void keyReleased (KeyEvent e) {}
		@Override
		public void keyTyped (KeyEvent e) {}
	}
	
	public MainPanel () {
		x=0;
		y=0;
		addKeyListener (new MainKey());
		setFocusable (true);
		Timer timer = new Timer (100, new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (direction == 0) {
					x--;
					try {
						image = ImageIO.read(new File("\\Users\\unico\\Pictures\\LEFT.png"));
					} catch (Exception e) {}
				}
				if (direction == 1) {
					y--;
					try {
						image = ImageIO.read(new File("\\Users\\unico\\Pictures\\UP.png"));
					} catch (Exception e) {}
				}
				if (direction == 2) {
					x++;
					try {
						image = ImageIO.read(new File("\\Users\\unico\\Pictures\\RIGHT.png"));
					} catch (Exception e) {}
				}
				if (direction == 3) {
					y++;
					try {
						image = ImageIO.read(new File("\\Users\\unico\\Pictures\\DOWN.png"));
					} catch (Exception e) {}
				}
				repaint();
			}
		});
		timer.restart();	
	}
	public void paintComponent(Graphics graphics) {
		graphics.clearRect(x-1, y-1, 301, 301);
		graphics.drawImage(image, x, y, 300, 300, null);
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