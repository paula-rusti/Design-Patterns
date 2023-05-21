package org.example.main;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();
    private final PaymentEventLogger paymentEventLogger = new PaymentEventLogger();
    private final NotificationManager notificationManager = new NotificationManager();

    public void pay() {
        // make the payment the notify the listeners
        paymentListeners.forEach(PaymentListener::paymentReceived);
    }

    public void registerPaymentListener(PaymentListener p) {
        paymentListeners.add(p);
    }

    public void unregisterPaymentListener(PaymentListener p) {
        paymentListeners.remove(p);
    }
}
