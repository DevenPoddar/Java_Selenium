package Day_3;

public abstract class Payment 
{
	 abstract void makePayment(double amount);
}
class Credit_Card extends Payment 
{
   void makePayment(double amount) 
   {
       System.out.println("Paid rs." + amount + " using Credit Card.");
   }
}
class UPI extends Payment 
{
   void makePayment(double amount) 
   {
       System.out.println("Paid ₹" + amount + " using UPI.");
   }


	
	
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	Payment p1 = new Credit_Card();
	  	p1.makePayment(1500);
	  	
	  	Payment p2 = new UPI();
	  	p2.makePayment(500);
  
	}
}



