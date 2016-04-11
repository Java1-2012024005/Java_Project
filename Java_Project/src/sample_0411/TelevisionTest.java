package sample_0411;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television ttv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 20;

		mytv.onOff = true;
		mytv.volumeUp();
		//mytv.volumeUp(30);
		
		yourtv.channel= 20;
		yourtv.volume=1;
		yourtv.onOff = false;
		mytv.channel = 232;
		mytv.pr();
		//System.out.println(mytv.channel+" "+mytv.volume+" "+mytv.onOff);
		
		yourtv.pr();
		//System.out.println(yourtv.channel+" "+yourtv.volume+" "+yourtv.onOff);
		ttv.pr();
		//System.out.println(ttv.channel+" "+ttv.volume+" "+ttv.onOff);

	}
}
