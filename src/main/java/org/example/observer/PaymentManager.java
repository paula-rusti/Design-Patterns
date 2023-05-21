package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager implements PaymentSubject{

    private final List<PaymentListener> paymentListeners = new ArrayList<>();

    public void pay() {
        // make the payment the notify the listeners
        paymentListeners.forEach(p -> p.paymentReceived(new PaymentEvent(this)));
    }

    public void registerPaymentListener(PaymentListener p) {
        paymentListeners.add(p);
    }

    public void unregisterPaymentListener(PaymentListener p) {
        paymentListeners.remove(p);
    }
}
