package org.example;

public class AuthorDecorator extends MessageDecorator {

    public AuthorDecorator(message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return addAuthor(message.getContent());
    }

    private String addAuthor(String text) {
        String authorName = "Сахно Маргарита";
        return text + " - " + authorName;
    }
}
