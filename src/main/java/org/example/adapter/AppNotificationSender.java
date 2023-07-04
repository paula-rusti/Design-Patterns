package org.example.adapter;

import org.example.adapter.dependency.DependencyNotificationSender;

public class AppNotificationSender implements NotificationSender{

    private final DependencyNotificationSender dependencyNotificationSender;

    public void sendNotification() {
        dependencyNotificationSender.send();
    }

    public AppNotificationSender(DependencyNotificationSender dependencyNotificationSender) {
        this.dependencyNotificationSender = dependencyNotificationSender;
    }
}
