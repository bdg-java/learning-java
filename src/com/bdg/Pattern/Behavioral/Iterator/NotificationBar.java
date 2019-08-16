package com.bdg.Pattern.Behavioral.Iterator;

import java.util.Iterator;

public class NotificationBar {

    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        Iterator iterator = (Iterator) notifications.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext()) {
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}

