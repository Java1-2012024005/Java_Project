package Chapter8_�����ӻ���;

import javax.swing.*;

public class �µ���ȯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JLabel lb1 = new JLabel("ȭ�� �µ�");
		JLabel lb2 = new JLabel("���� �µ�");
		JTextField fd1 = new JTextField(15);
		JTextField fd2 = new JTextField(15);
		JButton bt = new JButton("��ȯ");
		panel.add(lb1);
		panel.add(fd1);
		panel.add(lb2);
		panel.add(fd2);
		panel.add(bt);
		
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("�µ���ȯ��");
		f.setVisible(true);
	}

}
