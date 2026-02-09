package solid.ocp.interfaceEx;

//BAD model violating OCP
public class NotificationService {

    public void sendNotification(String message, String channel) {
        NotificationModel notify = new NotificationModel("Test Message");
        if (channel.equals("EMAIL")) {
            notify.sendEmail();
        } else if (channel.equals("SMS")) {
            notify.sendSMS();
        } else {
            throw new UnsupportedOperationException("Channel not supported: " + channel);
        }
    }
}
