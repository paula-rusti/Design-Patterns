package org.example.main;

public class PaymentManager {
    private final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();
    private final NotificationManager notificationManager = new NotificationManager();

    public void pay() {
        notificationManager.sendNotification();
        paymentEventLogger.logEvent();
    }
}
