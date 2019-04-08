package inheritance;

public class Animal {
	
	String color;
	
	public Animal() {
		System.out.println("Aniaml No Parameter Constructor");
	}
	
	public Animal(int height,int length,String color) {
		System.out.println("Animal heght is "+height+" and length is "+length);
	}
	
	public void sound() {
		System.out.println("Animal will raise sound");
	}

}
