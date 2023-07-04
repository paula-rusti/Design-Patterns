package org.example.decorator;

public class EmailSender implements NotificationSender{

    private final NotificationSender notificationSender;

    public EmailSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send(String message) {
        if (notificationSender != null)
            notificationSender.send(message);
        System.out.println("Sending email: " + message);
    }
}
