package Sample_0321;

public class For_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i<10 ; i++){
			System.out.println(" value : "+i);
		}
		
		for(int i = 1; i<10 ; i++){
			for(int j = 1; j<10 ; j++){
				System.out.println(i +"*" +j +"=" +i*j);
			}
		}
	}

}
