package ��ü;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void print()
	{
		System.out.println("�ڷ������� ä���� "+channel+"�ڷ������� ������ "+volume+"�Դϴ�.");
	}
	
	void setChannel(int ch)
	{
		channel = ch;
	}
	int getChannel() {
		return channel;
	}
}
