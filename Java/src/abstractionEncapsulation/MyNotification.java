package abstractionEncapsulation;

public abstract class MyNotification {
    abstract void msg(String message);
}

class EmailNotification extends MyNotification {
    void msg(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification extends MyNotification {
    void msg(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class PushNotification extends MyNotification {
    void msg(String message) {
        System.out.println("Push notification sent: " + message);
    }
}
class DeleteNotification extends MyNotification {
	void msg(String message) {
		System.out.println("Notification was Deleted: "+ message);
	}
}
