/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.ru.kristin.biblioteka.people;

import java.util.ArrayList;
import java.util.List;
import main.java.ru.kristin.biblioteka.Library.Book;

public class StudentBuilder implements Builder {

    private String fullName;

    @Override
    public Builder bldFullName() {
        StringBuilder sb = new StringBuilder();
        int indexOfName = 0;
        int indexOfSurname = 0;
        Integer randomSex = (int) Math.round(Math.random());
        if (randomSex.equals(0)) {
            indexOfName = (int) Math.round(Math.random() * (femaleNames.size() - 1));
            indexOfSurname = (int) Math.round(Math.random() * (femaleSurnames.size() - 1));
            this.fullName = sb.append(femaleSurnames.get(indexOfSurname))
                    .append(" ")
                    .append(femaleNames.get(indexOfName))
                    .toString();
        }
        if (randomSex.equals(1)) {
            indexOfName = (int) Math.round(Math.random() * (maleNames.size() - 1));
            indexOfSurname = (int) Math.round(Math.random() * (maleSurnames.size() - 1));
            this.fullName = sb.append(maleSurnames.get(indexOfSurname))
                    .append(" ")
                    .append(maleNames.get(indexOfName))
                    .toString();
        }
        return this;
    }
    @Override
    public People bldUser(List<Book> books) {
        People user = new Student(fullName);
        List<Book> bk = new ArrayList<>(books);
        int quantityOfBooks = (int) Math.round(Math.random() * (10 - 3) + 3);
        for (int i = 1; i <= quantityOfBooks; i++) {
            int numberOfBook = (int) Math.round(Math.random() * (bk.size() - 1));
            user.getTakenBooks().add(bk.get(numberOfBook));
            bk.remove(numberOfBook);
        }
        return user;
    }
}
