package frame_Example;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameButton extends JFrame {
	public static void main(String[] args) {
		
		Dimension dim = new  Dimension();
		JFrame frame = new JFrame("���� ������ ���� ����");
		frame.setLocation(400, 100);
		frame.setPreferredSize(dim);
		
		
		// 1. JButton�� ���� 
		  JButton jbt = new JButton("��ư");
		  frame.add(jbt);
		  
		// 2. �̹��� �ҷ�����
		ImageIcon ii = new ImageIcon("C:/Users/KDH/eclipse-workspace/Study_Java/mafia/bin/frame_Example/lmage/1.jpg");
		// ��ư�� ���콺�� �ö��� �� �̹��� ���� ��Ű��

		jbt.setRolloverIcon(new ImageIcon("button1.png"));

		// ��ư�� ���콺�� �ö��� �� ǳ������ �߰� �ϱ�
		jbt.setToolTipText("��ư1�Դϴ�.");

		// ��ư ������ ���� ��ġ �����ϱ�
		jbt.setVerticalTextPosition(JButton.BOTTOM);
		
		// ��ư ������ ���� ��ġ �����ϱ�
		jbt.setHorizontalTextPosition(JButton.RIGHT);
		
		frame.pack();
		frame.setVisible(true);

	}
}