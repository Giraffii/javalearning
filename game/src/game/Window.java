package game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame {
	
	private Field gameField;
	
	
	public Window() {
		gameField = new Field ();
		Container container = getContentPane ();
		container.add (gameField);
		setBounds (100, 100, 1120, 800);
		setTitle("Игра: Баскетбол");
		setVisible (true);
		addKeyListener(new keyGrab ());
	}
	
	private class keyGrab implements KeyListener {

		@Override
		public void keyPressed(KeyEvent event) {
			// обработчик нажатия на клавиши
			int keyCode = event.getKeyCode();
			if (keyCode == 37) { //LEFT
				gameField.basketX-=10;
				if (gameField.basketX < -gameField.basketW/2) {
					gameField.basketX = gameField.getWidth() - gameField.basketW/2;
				}
			} 
			if (keyCode == 39) { //RIGHT
				gameField.basketX+=10; 
				gameField.basketX-=10;
				if (gameField.basketX > -gameField.getWidth()/2) {
					gameField.basketX = - gameField.basketW/2;
				}
			} 
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Автоматически созданная заглушка метода
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Автоматически созданная заглушка метода
			
		}
		
	}
}
