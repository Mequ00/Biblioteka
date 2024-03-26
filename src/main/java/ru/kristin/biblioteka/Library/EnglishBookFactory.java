package main.java.ru.kristin.biblioteka.Library;

import main.java.ru.kristin.biblioteka.Library.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnglishBookFactory implements Bookfactory {

    private static List<String> educationNames = new ArrayList<>();
    private static List<String> universities = new ArrayList<>();
    private static List<String> educationAuthors = new ArrayList<>();
    private static List<String> levels = List.of("Бакалавриат ", "Магистратура ");
    private static List<String> fictionNames = new ArrayList<>();
    private static List<String> fictionAuthors = new ArrayList<>();
    private static List<Integer> years = new ArrayList<>();

    @Override
    public Book createTextbook() {
        Random random = new Random();
        String level = levels.get(random.nextInt(levels.size()));
        String university = universities.get(random.nextInt(universities.size()));
        String name = educationNames.get(random.nextInt(educationNames.size()));
        String author = educationAuthors.get(random.nextInt(educationAuthors.size()));
        String fullName = level + ": " + university + " " + name + " by " + author;
        return new EnglishTextbook(fullName, level);
    }

    @Override
    public Book createFiction() {
        Random random = new Random();
        String name = fictionNames.get(random.nextInt(fictionNames.size()));
        String author = fictionAuthors.get(random.nextInt(fictionAuthors.size()));
        Integer year = years.get(random.nextInt(years.size()));
        String fullName = name + " by " + author + " in " + year;
        return new EnglishFiction(fullName, year);
    }

    public static List<String> getEducationNames() {
        return educationNames;
    }

    public static void setEducationNames(List<String> educationNames) {
        EnglishBookFactory.educationNames = educationNames;
    }

    public static List<String> getUniversities() {
        return universities;
    }

    public static void setUniversities(List<String> universities) {
        EnglishBookFactory.universities = universities;
    }

    public static List<String> getEducationAuthors() {
        return educationAuthors;
    }

    public static void setEducationAuthors(List<String> educationAuthors) {
        EnglishBookFactory.educationAuthors = educationAuthors;
    }

    public static List<String> getLevels() {
        return levels;
    }

    public static void setLevels(List<String> levels) {
        EnglishBookFactory.levels = levels;
    }

    public static List<String> getFictionNames() {
        return fictionNames;
    }

    public static void setFictionNames(List<String> fictionNames) {
        EnglishBookFactory.fictionNames = fictionNames;
    }

    public static List<String> getFictionAuthors() {
        return fictionAuthors;
    }

    public static void setFictionAuthors(List<String> fictionAuthors) {
        EnglishBookFactory.fictionAuthors = fictionAuthors;
    }

    public static List<Integer> getYears() {
        return years;
    }

    public static void setYears(List<Integer> years) {
        EnglishBookFactory.years = years;
    }
    
    
}
