package org.example;

public class CompressionDecorator extends MessageDecorator {

    public CompressionDecorator(message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return compressText(message.getContent());
    }

    private String compressText(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}
