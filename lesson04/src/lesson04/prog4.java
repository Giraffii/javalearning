package lesson04;
import javax.swing.*;
import java.awt.*;
public class prog4 {

	public static void main(String[] args) {
		/*boolean istina = true;
		//включить/выключить
		byte o;
		
		int i = 0;
		if (istina) {
			i++;
			System.out.println (i);
		}*/
		class MainPanel extends JPanel {
			public void paintComponent(Graphics graphics) {
				super.paintComponent(graphics);
				graphics.setColor(Color.BLUE);
				graphics.fillRect(200, 50, 200, 100);
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
		}
		
		MainFrame window1 = new MainFrame ();
		
		
		
		class Animal {
			int age;
			int mass;
			int eyesNumber;
		}
		class Kitten {
			int age;
			int furColor;
			int eyesColor;
		}
		class Cats {
			int furColor;
			int eyesColor;
		}
		class Dogs {
			int name;
			int age;
		}
		
		
		/*Animal chicken = new Animal () ;
		//обязательно круглые скобки
		 chicken.age = 1;
		 chicken.mass = 20;
		 chicken.eyesNumber= 2;
		 
		Kitten cat = new Kitten () ;
		cat.furColor = 1;
		cat.eyesColor = 3;
		cat.age = 4;
		
		
		Dogs snoopy = new Dogs ();
		Cats puma = new Cats ();
		
		System.out.ptintln (Kitten.age);
		
		JFrame window = new JFrame ();
		window.setBounds(100, 100, 600, 400);
		window.setVisible(true);
		

 	class Birds extends Animal {
			int beakLenght;
		}
		class Reptiles extends Animal {
			int scaleThikness;
		}
		class Puppy extends Animal {
			int barkLoundness;
		}
	class Cat extends Animal {
			int purrFrequency;
		}*/
		
	}
}
