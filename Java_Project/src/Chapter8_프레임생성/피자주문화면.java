package Chapter8_프레임생성;
import java.awt.Color;

import javax.swing.*;
public class 피자주문화면 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel lb1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JButton bt1 = new JButton("combo");
		JButton bt2 = new JButton("potato");
		JButton bt3 = new JButton("bulgogi");
		JLabel lb2 = new JLabel("개수");
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
		f.setTitle("피자주문기");
		
		f.setVisible(true);
	}

}
