package inheritance;

public class Tiger extends Animal {

String tigerColor;
	
	public Tiger() {
		System.out.println("Tiger Default Constructor");
	}
	
	public Tiger(int height,int length,String color) {
		super(height,length,color);
		System.out.println("Tiger heght is "+height+" and length is "+length);
		
	}
	
	public void sound() {
		super.sound();
		System.out.println("Tiger will roar");
		System.out.println("Tiger will roar");
		System.out.println("Tiger will roar");
		System.out.println("Tiger will roar");
	}

	
}
