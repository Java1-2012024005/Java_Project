package Chapter8_프레임생성;

import javax.swing.*;

public class 온도변환기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel lb1 = new JLabel("화씨 온도");
		JLabel lb2 = new JLabel("섭씨 온도");
		JTextField fd1 = new JTextField(15);
		JTextField fd2 = new JTextField(15);
		JButton bt = new JButton("변환");
		panel.add(lb1);
		panel.add(fd1);
		panel.add(lb2);
		panel.add(fd2);
		panel.add(bt);
		
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");
		f.setVisible(true);
	}

}
