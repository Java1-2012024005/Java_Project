package Chapter8_�����ӻ���;
import java.awt.Color;

import javax.swing.*;
public class �����ֹ�ȭ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel lb1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		JButton bt1 = new JButton("combo");
		JButton bt2 = new JButton("potato");
		JButton bt3 = new JButton("bulgogi");
		JLabel lb2 = new JLabel("����");
		JTextField fd = new JTextField(15);
		
		panelA.add(lb1);
		panelA.setBackground(Color.cyan);
		panelB.add(bt1);
		panelB.add(bt2);
		panelB.add(bt3);
		panelB.add(lb2);
		panelB.add(fd);
		panel.add(panelA);
		panel.add(panelB);
		f.add(panel);
		f.setSize(600, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("�����ֹ���");
		
		f.setVisible(true);
	}

}
