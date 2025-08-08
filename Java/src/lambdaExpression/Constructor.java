package lambdaExpression;

public class Constructor {

	int a;
	int b;

	// Constructor
	Constructor(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// Copy Constructor
	Constructor(Constructor c) {
		this.b = c.a;
		this.a = c.b;
	}

	public static void main(String[] args) {

		Constructor b1 = new Constructor(100, 300);
		Constructor b2 = new Constructor(b1);
		System.out.println(b2.a);
	}
}
