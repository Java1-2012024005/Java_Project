package Chapter6_주소에의한호출_배열;

public class ArrayProcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]={1,2,3,4,5};
		ArrayProc obj1 = new ArrayProc();
		obj1.inc(list);
		for(int i=0; i<5; i++)
			System.out.println(list[i]+"  ");
		
	} 	

}
