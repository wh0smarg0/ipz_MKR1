package org.example;

public class EncryptionDecorator extends MessageDecorator {

    public EncryptionDecorator(message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encryptText(message.getContent());
    }

    private String encryptText(String text) {

        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}
