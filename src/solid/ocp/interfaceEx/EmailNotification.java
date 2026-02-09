package solid.ocp.interfaceEx;

//GOOD model adhering to OCP
public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        // Logic to send email notification
        System.out.println("Sending Email Notification: " + message);
    }
}
