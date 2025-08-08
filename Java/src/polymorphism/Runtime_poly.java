package polymorphism;

public class Runtime_poly {

	void sound() {
		System.out.println("Hello i am Deven Poddar");
	}
	
}
class rp extends Runtime_poly{
	
	void sound() {
		System.out.println("HI i am DP");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime_poly rp = new rp();
		rp.sound();
	}

}

