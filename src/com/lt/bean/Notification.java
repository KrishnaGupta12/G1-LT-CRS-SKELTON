package com.lt.bean;

public class Notification {
    private long notificationId;
    private boolean notificationStatus;
    private String notificationMassages;

    public long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    public boolean isNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(boolean notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public String getNotificationMassages() {
        return notificationMassages;
    }

    public void setNotificationMassages(String notificationMassages) {
        this.notificationMassages = notificationMassages;
    }
}
