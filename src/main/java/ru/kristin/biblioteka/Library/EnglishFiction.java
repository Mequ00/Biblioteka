package main.java.ru.kristin.biblioteka.Library;

import main.java.ru.kristin.biblioteka.Library.Book;

public class EnglishFiction extends Book {

    private int year;

    public EnglishFiction(String name, int year) {
        super(name);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
