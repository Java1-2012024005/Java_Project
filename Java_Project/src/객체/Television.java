package 객체;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void print()
	{
		System.out.println("텔레비전의 채널은 "+channel+"텔레비전의 음량은 "+volume+"입니다.");
	}
	
	void setChannel(int ch)
	{
		channel = ch;
	}
	int getChannel() {
		return channel;
	}
}
