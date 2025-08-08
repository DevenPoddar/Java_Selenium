package Day_3;
import java.util.Scanner;
public class My_Notfication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Choose notification type: 1. Email  2. SMS  3. Push");
        int type = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter message: ");
        String msg = sc.nextLine();

        Ab_Notification n;
        if (type == 1) {
        	n = new EmailNotification();
        }
        else if (type == 2) {
        	n = new SMSNotification();
        }
        else if(type == 3){
        	n = new PushNotification();
        }
        else {
        	n = new DeleteNotification();
        }

        n.msg(msg);
	}

}
