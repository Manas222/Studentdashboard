package com.student.studentdashboard;

import java.util.Date;


public class Notification {
    String notificationType;

    public Date getNotificationDate()
    {
        return notificationDate;
    }

    public void setNotificationDate(Date notificationDate) {
        this.notificationDate = notificationDate;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public int getNotificationPriority()
    {
        return notificationPriority;
    }

    public void setNotificationPriority(int notificationPriority) {
        this.notificationPriority = notificationPriority;
    }

    Date notificationDate;
    int notificationPriority;
}
