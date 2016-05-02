package Sample_0502;

public class Box {
	int width, length, height;
	int volume;
	
	Box(int w, int l, int h){
		width = w;
		height = h;
		length = l;
		volume = w*l*h;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	Box whosLargest(Box box1, Box box2, int x){
		box1.setHeight(99);
		box2.setHeight(999);
		x = 1234556;
		if(box1.volume > box2.volume)
			return box1;
		else return box2;
	}
	
	void method2(Box box1){
		Box temp = new Box(7,8,9); // 이렇게 하면 새로운 객체를 만드는 것
		temp.height = box1.height;
		temp.length = box1.length;
		temp.width = box1.width;
		temp.volume = box1.volume;
		// object가 템프라는 것이 새롭게 만들어짐. 내용은 같지만 독립적인 객체를 생성함.
	}
}
