package Chapter6_주소에의한호출;

public class MyCouterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCouter obj = new MyCouter();
		
		System.out.println("obj.value="+obj.value);
		obj.inc(obj);
		System.out.println("obj.value="+obj.value);
	}

}
