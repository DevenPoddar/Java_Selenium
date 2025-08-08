package ex;
import java.util.Scanner;
public class Chat_Bot {
 
    String respond(String userMessage) {
        if (userMessage.toLowerCase().contains("hello")) 
        {
            return "Hi!";
        } else if (userMessage.toLowerCase().contains("bye")) 
        {
            return "Goodbye!";
        }else if(userMessage.toLowerCase().contains("how are you"))
        {
        	return "Fine. What about you ?";	
        }
        else {
            return "I don't understand.";
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	Scanner scanner = new Scanner(System.in);
	        Chat_Bot bot = new Chat_Bot();
	        
	        System.out.print("");
	        String userInput = scanner.nextLine();

	        String reply = bot.respond(userInput);
	        System.out.println(reply);		
	}

}
