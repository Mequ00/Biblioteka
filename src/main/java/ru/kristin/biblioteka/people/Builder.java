package main.java.ru.kristin.biblioteka.people;

import java.util.ArrayList;
import java.util.List;
import main.java.ru.kristin.biblioteka.Library.Book;
import main.java.ru.kristin.biblioteka.manager.CsvProvider;

public abstract class Builder {

    private List<String> femaleNames = new ArrayList<>();
    private List<String> maleNames = new ArrayList<>();
    private final CsvProvider provider = new CsvProvider();

    abstract Builder bldFullName();

    abstract People bldUser(List<Book> books);

    abstract void readInfo();

    abstract void cleanInfo();

    public List<String> getFemaleNames() {
        return femaleNames;
    }

    public void setFemaleNames(List<String> femaleNames) {
        this.femaleNames = femaleNames;
    }

    public List<String> getMaleNames() {
        return maleNames;
    }

    public void setMaleNames(List<String> maleNames) {
        this.maleNames = maleNames;
    }

    public CsvProvider getProvider() {
        return provider;
    }
    
    

}
