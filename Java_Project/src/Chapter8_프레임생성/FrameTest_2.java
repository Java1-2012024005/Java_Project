package Chapter8_프레임생성;
import java.awt.FlowLayout;

import javax.swing.*;
public class FrameTest_2 extends JFrame{
	
	public FrameTest_2()
	{
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setLayout(new FlowLayout());
		JButton button = new JButton("Button");
		this.add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameTest_2 f = new FrameTest_2();
		
	}

}
