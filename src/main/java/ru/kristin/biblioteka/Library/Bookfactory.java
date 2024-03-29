package main.java.ru.kristin.biblioteka.Library;


public interface Bookfactory {

    Book createTextbook();

    Book createFiction();
    
    void cleanInfo();
    
    void readInfo();
}
