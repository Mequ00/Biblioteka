/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.ru.kristin.biblioteka.people;

import java.util.List;
import main.java.ru.kristin.biblioteka.Library.Book;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public People createUser(List<Book> books){
        return builder.bldFullName().bldUser(books);
    }
    
}
