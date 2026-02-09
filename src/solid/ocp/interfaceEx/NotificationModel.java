package solid.ocp.interfaceEx;

//BAD model violating OCP
public class NotificationModel {
    private String message;

    public NotificationModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String sendSMS() {
        return message;
    }
    public String sendEmail() {
        return message;
    }
}
