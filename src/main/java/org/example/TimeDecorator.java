package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDecorator extends MessageDecorator {

    public TimeDecorator(message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addTimestamp(message.getContent());
    }

    private String addTimestamp(String text) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[" + sdf.format(new Date()) + "] " + text;
    }
}
