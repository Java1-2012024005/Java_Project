package Sample_0502;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		Box obj1 = new Box(10,20,50);
		Box obj2 = new Box(10,30,30);
		
		Box largest = obj1.whosLargest(obj1, obj2, x);
		System.out.println("(" + largest.width + "," + largest.length + "," + largest.height + ")");
		
		System.out.println(obj1.getLength()+" "+obj2.getLength()+" "+x);
		System.out.println(obj1.getHeight()+" "+obj2.getHeight()+" "+x);
	}

}
