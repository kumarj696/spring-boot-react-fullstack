package com.amigoscode.demo.notification;

import java.time.ZonedDateTime;

public class notification {

    private String message;
    private ZonedDateTime timestamp;

    public notification(String message,ZonedDateTime timestamp){
        this.message=message;
        this.timestamp=timestamp;
    }



}
