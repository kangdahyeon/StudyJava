package GUIchatting;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class countDown2 extends JFrame {
	
	JFrame jframe;
	JLabel jLabel;
	
	public countDown2() {
		setTitle("���� �ð�");
		setSize(430, 110);
		setBounds(300, 300, 400, 100); // ������ġ�� ��ġ.
		getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 15;

            public void run() {
            	
                jLabel.setText("�����ð�: " + i);
                i--;

                if (i < 0) {
                    timer.cancel();
                    jLabel.setText("Time Over");
                }
            }
        }, 0, 1000);
        
        JButton btnDispose = new JButton("Dispose");
        btnDispose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
            }
        });
	}
       

//        jframe.add(jLabel);  ������Ʈ 
//        jframe.setVisible(true); ������Ʈ ��ġ���� 

        
 }