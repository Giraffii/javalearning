package game;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;
public class Field extends JPanel {
	private Image background;
	private Image basket;
	int basketX = 0, basketY = 550; //���������� ��������� �������
	int basketW = 200, baskerH = 200; //������ � ������ �������
	public Field() {
		try {
			//������� ��������� ���� � ������� ������������
			background = ImageIO.read(new File ("\\Users\\unico\\git\\javalearning\\game\\court.jpg\\"));
			//����������� ����� � ��������
			basket = ImageIO.read(new File ("\\Users\\unico\\git\\javalearning\\game\\basket.png\\"));
		} catch (IOException e) {
			// TODO ������������� ��������� ���� catch
			e.printStackTrace();
		}
		Timer repaintTimer = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				repaint();
			}
		});
		repaintTimer.start();
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, null);
		g.drawImage(basket, basketX, basketY, basketW, baskerH, null);
	}
}
