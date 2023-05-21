package org.example.main;

public interface PaymentListener {
    // a contract implemented by anyone observing the payments
    // functional interface
    void paymentReceived(PaymentEvent e);
}
