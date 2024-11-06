package org.example;

public abstract class MessageDecorator implements message{
    protected message message;

    public MessageDecorator(message message) {
        this.message = message;
    }

    public String getContent() {
        return message.getContent();
    }
}
