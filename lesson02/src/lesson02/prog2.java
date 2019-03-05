package lesson02;

import javax.swing.*;

public class prog2 {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		JOptionPane.showMessageDialog(null, "Добро пожаловать на изучение Java!");
		
		String cat;
		String dog = "Hamster Petrovich";
		int i = 0;
		Integer r = 0;
		long d = 100;
		Long l;
		float h = 0;
		double t = 0.0;
		Double y = 0.0;
		short gg = -1;
		char letter = 'h';
		System.out.println(dog);
		
		
		
		
		int i1 = 1, i2 = 2;
		int j1, j2;
		System.out.println("Variable y: "+y+"; i1="+i1);
		//System.out.println(i1=i2);
		
		j1 = i1 + i2*5;
		System.out.println("j1="+j1);
		
		JOptionPane.showMessageDialog(null, j1*16+i2/2);
		
		int de = 4;
		int re = 6;
		de = re*10-de;
		
		JOptionPane.showMessageDialog(null,  de+re*j1);
		
	}

}
