package main.java.ru.kristin.biblioteka.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import main.java.ru.kristin.biblioteka.manager.CsvProvider;

public class EnglishBookFactory implements Bookfactory {

    private List<String> educationNames = new ArrayList<>();
    private List<String> universities = new ArrayList<>();
    private List<String> educationAuthors = new ArrayList<>();
    private List<String> levels = List.of("Бакалавриат", "Магистратура");
    private List<String> fictionNames = new ArrayList<>();
    private List<String> fictionAuthors = new ArrayList<>();
    private List<Integer> years = new ArrayList<>();
    private final String fictionPath = "C:\\Users\\krist\\Downloads\\Telegram Desktop\\Англ.лит..csv";
    private final String eductionPath = "C:\\Users\\krist\\Downloads\\Англ.уч..csv";
    private final CsvProvider provider = new CsvProvider();

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

    @Override
    public void cleanInfo() {
        this.fictionNames.clear();
        this.fictionAuthors.clear();
        this.years.clear();
        this.educationNames.clear();
        this.universities.clear();
        this.educationAuthors.clear();
    }
    
    @Override
    public void readInfo() {
        provider.readEnglishEducationBooksInfo(eductionPath, this);
        provider.readEnglishFictionBooksInfo(fictionPath, this);
    }

    public List<String> getEducationNames() {
        return educationNames;
    }

    public void setEducationNames(List<String> educationNames) {
        this.educationNames = educationNames;
    }

    public List<String> getUniversities() {
        return universities;
    }

    public void setUniversities(List<String> universities) {
        this.universities = universities;
    }

    public List<String> getEducationAuthors() {
        return educationAuthors;
    }

    public void setEducationAuthors(List<String> educationAuthors) {
        this.educationAuthors = educationAuthors;
    }

    public List<String> getLevels() {
        return levels;
    }

    public void setLevels(List<String> levels) {
        this.levels = levels;
    }

    public List<String> getFictionNames() {
        return fictionNames;
    }

    public void setFictionNames(List<String> fictionNames) {
        this.fictionNames = fictionNames;
    }

    public List<String> getFictionAuthors() {
        return fictionAuthors;
    }

    public void setFictionAuthors(List<String> fictionAuthors) {
        this.fictionAuthors = fictionAuthors;
    }

    public List<Integer> getYears() {
        return years;
    }

    public void setYears(List<Integer> years) {
        this.years = years;
    }

}
