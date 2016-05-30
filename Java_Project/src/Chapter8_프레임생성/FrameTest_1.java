package Chapter8_프레임생성;

import java.awt.FlowLayout;

import javax.swing.*;

public class FrameTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Frame Test");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		f.setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		f.add(button);
		f.setVisible(true);		
	}

}
