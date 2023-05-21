package org.example.main;

public class PaymentEventLogger implements PaymentListener{

    @Override
    public void paymentReceived() {
        logEvent();
    }
    private void logEvent() {
        System.out.println("Payment receieved!");
    }
}
