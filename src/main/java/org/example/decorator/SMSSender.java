package org.example.decorator;

public class SMSSender implements NotificationSender{

    private final NotificationSender notificationSender;

    public SMSSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send(String message) {
        if (notificationSender != null)
            notificationSender.send(message + " (via SMS)");
        System.out.println("Sending SMS: " + message);
    }
}
