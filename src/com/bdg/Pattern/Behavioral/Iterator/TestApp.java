package com.bdg.Pattern.Behavioral.Iterator;

public class TestApp {
    public static void main(String args[])
    {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
