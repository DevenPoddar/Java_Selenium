package polymorphism;

public class PolyEX {
	void sound() {
		System.out.println("Hello i am Deven Poddar");
	}
	
}

class my_rp extends PolyEX
{
	
	void sound() 
	{
		System.out.println("HI i am DP");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ex_Runtime_poly rps = new rpe();
		rps.sound();
	}
}
