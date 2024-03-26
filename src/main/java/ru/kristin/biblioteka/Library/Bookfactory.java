package main.java.ru.kristin.biblioteka.Library;
import main.java.ru.kristin.biblioteka.Library.Book;

public interface Bookfactory {

    Book createTextbook();

    Book createFiction();
}
