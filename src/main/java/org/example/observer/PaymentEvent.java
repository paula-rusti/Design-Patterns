package org.example.observer;

// will become part of the contract
public class PaymentEvent {

    private final PaymentSubject paymentSubject;

    public PaymentEvent(PaymentSubject paymentSubject) {
        this.paymentSubject = paymentSubject;
    }

}
