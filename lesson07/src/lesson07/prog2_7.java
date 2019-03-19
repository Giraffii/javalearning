package lesson07;

import java.awt.event.*;
import java.awt.*;

public class prog2_7 {

	public static void main(String[] args) {
		 /*TestClass object = new TestClass ();
		 object.show();
		 TestClass second = new TestClass ("Дургой конструктор");
		 second.show(5);
		 int a = 5, b;
		 try {
		  b = a/0;
		 } catch (ArithmeticException e) {
			 e.printStackTrace();
		 } catch (IOException e) {
			 
		 } catch (Exception e) {
			 
		 }
		 b = a+2;
		 System.out.println(b);*/
	}

}

class TestClass {
private class MainKey implements KeyListener {
		
		@Override
		public void keyPressed (KeyEvent arg0) {
			int code = arg0.getKeyCode();
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
	
	public void show ( ) {
		System.out.println("Метод класса");
	}
	public void show (int u) {
		for(int i=0; i<u; i++) System.out.println ("Метод класса");
	}
	public TestClass () {
		System.out.println("Метод был запущен в конструкторе.");
		addKeyListener(new MainKey());
		setFocusable(true);
	}
	public TestClass (String initString) {
		System.out.println("initString");
	}
	
}