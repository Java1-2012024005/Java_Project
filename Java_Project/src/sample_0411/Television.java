package sample_0411;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr() {
		System.out.println(channel+" "+volume+" "+onOff); 
	}
	
	int volumeUp(int up_data){
		int vol = volume;
		vol += up_data;
		return vol;
	}
	void volueUp(int data){
		if(onOff==false){
			System.out.println("TV Die");
			return;
		}
		volume +=data;
	}
	void volumeUp(){
		if(onOff==false){
		System.out.println("TV Die");
		return;
		}
		volume +=1;
	}
}




/*
 void volumeUP(int data){
volume+=data;
}
*/