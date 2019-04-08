package inheritance;

public class Cat extends Animal{
	
	String catColor;
		
	public Cat() {
		System.out.println("Cat No Parameter Constructor");
	}
	
	public Cat(int height,int length,String color) {
		super(height,length,color);
		System.out.println("Cat heght is "+height+" and length is "+length);
		
	}
	
	public void sound() {
		super.sound();
		System.out.println("Sounds Meow");
	}


}
