package main.java.ru.kristin.biblioteka.Library;

import main.java.ru.kristin.biblioteka.Library.Book;

public class EnglishTextbook extends Book {

    private String level;

    public EnglishTextbook(String name, String level) {
        super(name);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
