package main.java.ru.kristin.biblioteka.people;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import main.java.ru.kristin.biblioteka.Library.Book;

public abstract class People {

    private String name;
    private ArrayList<Book> takenBooks;

    public People(String name) {
        this.name = name;
        takenBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Book> getTakenBooks() {
        return takenBooks;
    }

    public void setBooks(ArrayList<Book> takenBooks) {
        ArrayList<Book> books = new ArrayList<>(takenBooks);
        this.takenBooks = books;
    }

    public void takeBook(ArrayList<Book> books) {
        int randomOfQuantity;
        int random;
        ArrayList<Book> copybooks = new ArrayList<>(books);
        randomOfQuantity = (int) Math.round(Math.random() * 7 + 3);
        for (int j = 0; j < randomOfQuantity; j++) {
            random = (int) Math.round(Math.random() * (copybooks.size() - 1));
            takenBooks.add(copybooks.get(random));
            copybooks.remove(random);
        }
    }

    public MutableTreeNode getBookNode() {
        DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(this.getName());
        for (Book book : takenBooks) {
            bookNode.add(new DefaultMutableTreeNode(book.getName()));
        }
        return bookNode;
    }
}
