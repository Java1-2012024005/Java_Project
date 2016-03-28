package Sample_0328;

public class Break_Conti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			System.out.println("before : " + i);
			if(i==2) continue;
			System.out.println("after : " + i);
			System.out.println("********************");
		}
		for(int i = 1;i<=4;i++){
		System.out.println("before : " + i);
		if (i == 2)
			break;
		System.out.println("after : " + i);
		System.out.println("********************");
		}
	}
}
