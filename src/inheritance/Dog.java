package inheritance;

public class Dog extends Animal{
	
	String dogColor;
	
	public Dog() {
		System.out.println("Dog No Parameter Constructor");
	}
	
	public Dog(int height,int length,String color) {
		super(height,length,color);
		System.out.println("Dog heght is "+height+" and length is "+length);
		
	}
	
	public void sound() {
		super.sound();
		System.out.println("Dog will bark");
	}

}
