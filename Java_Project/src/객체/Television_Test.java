package °´Ã¼;

public class Television_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv;
		tv = new Television();
		tv.channel=3;
		tv.volume=2;
		tv.onOff=true;
		
		tv.print();
		System.out.println(tv.getChannel());
		tv.setChannel(555);
		System.out.println(tv.channel);
	}

}
