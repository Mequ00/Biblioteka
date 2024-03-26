package main.java.ru.kristin.biblioteka.people;

import java.util.ArrayList;
import java.util.List;
import main.java.ru.kristin.biblioteka.Library.Book;

public interface Builder {

    public static List<String> femaleNames = new ArrayList<>();
    public static List<String> maleNames = new ArrayList<>();
    public static List<String> maleSurnames = new ArrayList<>();
    public static List<String> femaleSurnames = new ArrayList<>();
    public static List<String> femaleTSurnames = new ArrayList<>();
    public static List<String> maleTSurnames = new ArrayList<>();
    public static List<String> secondNames = new ArrayList<>();

    abstract Builder bldFullName();

    abstract People bldUser(List<Book> books);

}
