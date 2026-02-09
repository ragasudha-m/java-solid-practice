package solid.ocp.interfaceEx;

//GOOD model adhering to OCP
public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        // Logic to send SMS notification
        System.out.println("Sending SMS Notification: " + message);
    }
}
