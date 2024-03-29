package main.java.ru.kristin.biblioteka.manager;



import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import main.java.ru.kristin.biblioteka.Library.Book;
import main.java.ru.kristin.biblioteka.Library.EnglishBookFactory;
import main.java.ru.kristin.biblioteka.Library.RussianBookFactory;
import main.java.ru.kristin.biblioteka.people.Director;
import main.java.ru.kristin.biblioteka.people.People;
import main.java.ru.kristin.biblioteka.people.StudentBuilder;
import main.java.ru.kristin.biblioteka.people.TeacherBuilder;


public class DataManipulation {

    private ArrayList<People> teachers = new ArrayList<>();
    private ArrayList<People> students = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public void creationStudent() {
        StudentBuilder builder = new StudentBuilder();
        builder.readInfo();
        Director studentDirector = new Director(builder);
        for (int i = 0; i < 61; i++) {
            students.add(studentDirector.createUser(books));
        }
    }

    public void creationTeacher() {
        TeacherBuilder tBuilder = new TeacherBuilder();
        tBuilder.readInfo();
        Director studentDirector = new Director(tBuilder);
        for (int i = 0; i < 21; i++) {
            teachers.add(studentDirector.createUser(books));
        }
    }

    public void creationBook() {
        EnglishBookFactory ebfactory = new EnglishBookFactory();
        RussianBookFactory rbfactory = new RussianBookFactory();
        ebfactory.readInfo();
        rbfactory.readInfo();
        int randomRussianFiction = (int) Math.round(Math.random() * 15 + 20);
        int randomRussianTextbook = (int) Math.round(Math.random() * 15 + 20);
        for (int i = 0; i < randomRussianFiction; i++) {
            books.add(rbfactory.createFiction());
        }
        for (int i = 0; i < 50 - randomRussianFiction; i++) {
            books.add(ebfactory.createFiction());
        }
        for (int i = 0; i < randomRussianTextbook; i++) {
            books.add(rbfactory.createTextbook());
        }
        for (int i = 0; i < 50 - randomRussianTextbook; i++) {
            books.add(ebfactory.createTextbook());
        }
    }

    public TreeNode addInfoToGUI() {
        DefaultMutableTreeNode main = new DefaultMutableTreeNode("Пользователи");
        main.add(getStudentNodes());
        main.add(getTeacherNodes());
        return main;
    }

    private MutableTreeNode getStudentNodes() {
        DefaultMutableTreeNode stNode = new DefaultMutableTreeNode("Студенты");
        for (People student : students) {
            stNode.add(student.getBookNode());
        }
        return stNode;
    }

    private MutableTreeNode getTeacherNodes() {
        DefaultMutableTreeNode tchNode = new DefaultMutableTreeNode("Преподаватели");
        for (People teacher : teachers) {
            tchNode.add(teacher.getBookNode());
        }
        return tchNode;
    }

    public ArrayList<People> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<People> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<People> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<People> students) {
        this.students = students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
