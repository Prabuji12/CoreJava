package inheritance;

public class Cow extends Animal {
	
	String cowColor;
	
	public Cow() {
		System.out.println("Cat No Parameter Constructor");
	}
	
	public Cow(int height,int length,String color) {
		super(height,length,color);
		System.out.println("Cow heght is "+height+" and length is "+length);
		
	}
	
	public void sound() {
		super.sound();
		System.out.println("Sounds woff");
	}

}
