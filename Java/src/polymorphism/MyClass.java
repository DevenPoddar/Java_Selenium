package polymorphism;

public class MyClass {
	
	void sound() {
		System.out.println("Hello i am Deven Poddar");
	}
}
class My_rp extends MyClass
{
	
	void sound()
	{
		System.out.println("HI i am DP");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass rps = new My_rp();
		rps.sound();

	}

}
