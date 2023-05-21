package org.example.main;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();
        paymentManager.registerPaymentListener(new PaymentEventLogger("identifier"));
        paymentManager.registerPaymentListener(new NotificationManager());
        paymentManager.pay();
    }
}
