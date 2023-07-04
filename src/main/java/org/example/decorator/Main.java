package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        NotificationSender s1 = new EmailSender(new SMSSender(null));
        NotificationSender s2 = new SMSSender(new EmailSender(null));
        NotificationSender s3 = new EmailSender(new SMSSender(new EmailSender(null)));

        s1.send("Hello");
        System.out.println("-----");
        s2.send("Hello");
        System.out.println("-----");
        s3.send("Hello");
    }
}
