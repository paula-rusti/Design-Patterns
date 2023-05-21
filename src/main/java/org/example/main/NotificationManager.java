package org.example.main;

public class NotificationManager implements PaymentListener {

    @Override
    public void paymentReceived() {
        sendNotification();
    }

    public void sendNotification() {
        System.out.println("Notification sent!");
    }
}
