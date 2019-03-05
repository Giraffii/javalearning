package lesson03;

import javax.swing.*;

public class prog3 {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		String string = "Hello";
		int t = 255;
		/*System.out.println(string);
		JFrame window = new JFrame();
		window.setBounds(100, 100, 600, 200);
		window.setVisible(true);
		
		for (int i=1; i<=10; i=i+1) {
			JFrame window1 = new JFrame();
			window1.setTitle("Value I="+i);
			window1.setBounds(100+i*50, 100+i*50, 600, 200);
			window1.setVisible(true);	
		}*/
		
		if (string=="Hello") {
			System.out.println("Строка совпала");
		}
		
		//println - переносит на новую строчку, print - нет
		
	
		int wallet1 = 300, wallet2 = 400, wallet3 = 600;
		
		String[] array = new String[10];
		for (int i=0; i<array.length; i++) array[i]="";
		array[0] = "Вася";
		array[1] = "Петя";
		array[2] = "Алена";
		int[] wallet = new int[10];
		for (int i=0; i<3; i++) {
			wallet[i] = 145 + i*42;
		}
		
	
		for (int i=0; i<10; i++) {
			System.out.print(array[i]);
			System.out.print("  ");
			if (array[i] !="Петя") {
				System.out.println(wallet[i]);
			} else {
				System.out.println("10000");
			}
		}
	}

}
