package frame_Example;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame extends JFrame{
	static JPanel page1 = new JPanel();
	
	/*���� �ִ� ����� �̹����� �����ӿ��� �׷��ٰ���.*/
	private Image background = new ImageIcon(
			"C:/Users/KDH/eclipse-workspace/Study_Java/mafia/bin/frame_Example/lmage/1.jpg").getImage();//����̹���
	
	/*�������Դϴ�.*/
	public Frame() {
		homeframe();
	}
	public void homeframe() {
		setTitle("1");//â�� Ÿ��Ʋ
		setSize(400,600);//�������� ũ��
		setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		setLocationRelativeTo(null);//â�� ��� ������
		setLayout(null);
		setVisible(true);//â�� ���̰�	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
	}
	
	public void paint(Graphics g) {//�׸��� �Լ�
		g.drawImage(background, 0, 0, null);//background�� �׷���
	}
	public static void main(String[] args){
		new Frame();
		
	}
}