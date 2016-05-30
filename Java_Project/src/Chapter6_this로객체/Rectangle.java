package Chapter6_this�ΰ�ü;

public class Rectangle {
	private int x, y;
	private int width, height;
	
	Rectangle()
	{
		this(0,0,1,1);
	}
	
	Rectangle(int x, int y, int width, int height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	Rectangle(int width, int height)
	{
		this(0,0,width,height);
	}
	
	public String toString()
	{
		return x+"   "+y+"width"+width+"height"+height;
	}
}
