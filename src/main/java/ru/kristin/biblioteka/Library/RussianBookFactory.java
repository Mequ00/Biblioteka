package main.java.ru.kristin.biblioteka.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import main.java.ru.kristin.biblioteka.manager.CsvProvider;

public class RussianBookFactory implements Bookfactory {

    private List<String> educationNames = new ArrayList<>();
    private List<String> types = new ArrayList<>();
    private List<String> adjectives = new ArrayList<>();
    private List<String> mainWords = new ArrayList<>();
    private List<String> whoms = new ArrayList<>();
    private List<String> fairyWords = new ArrayList<>();
    private List<String> mainCharacters = new ArrayList<>();
    private final String fictionPath = "C:\\Users\\krist\\Downloads\\Telegram Desktop\\Рус.лит..csv";
    private final String eductionPath ="C:\\Users\\krist\\Downloads\\Telegram Desktop\\Рус.уч. (3).csv";
    private final CsvProvider provider = new CsvProvider();

    @Override
    public Book createTextbook() {
        Random random = new Random();
        String name = educationNames.get(random.nextInt(educationNames.size()));
        String type = types.get(random.nextInt(types.size()));
        String fullName = type + " по " + name;
        return new RussianTextbook(fullName);
    }

    @Override
    public Book createFiction() {
        String fullName = null;
        Random random = new Random();
        switch (random.nextInt(2)) {
            case 0 -> {
                String adjective = adjectives.get(random.nextInt(adjectives.size()));
                String mainWord = mainWords.get(random.nextInt(mainWords.size()));
                String whom = whoms.get(random.nextInt(whoms.size()));
                fullName = adjective + " " + mainWord + " " + whom;
            }
            case 1 -> {
                String fairyWord = fairyWords.get(random.nextInt(fairyWords.size()));
                String mainCharacter = mainCharacters.get(random.nextInt(mainCharacters.size()));
                fullName = fairyWord + " о " + mainCharacter;
            }
        }
        return new RussianFiction(fullName);
    }

    @Override
    public void cleanInfo() {
        this.adjectives.clear();
        this.educationNames.clear();
        this.fairyWords.clear();
        this.mainCharacters.clear();
        this.mainWords.clear();
        this.types.clear();
        this.whoms.clear();
    }

    @Override
    public void readInfo() {
        provider.readRussianEducationBooksInfo(eductionPath, this);
        provider.readRussianFictionBooksInfo(fictionPath, this);
    }

    public List<String> getEducationNames() {
        return educationNames;
    }

    public void setEducationNames(List<String> educationNames) {
        this.educationNames = educationNames;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(List<String> adjectives) {
        this.adjectives = adjectives;
    }

    public List<String> getMainWords() {
        return mainWords;
    }

    public void setMainWords(List<String> mainWords) {
        this.mainWords = mainWords;
    }

    public List<String> getWhoms() {
        return whoms;
    }

    public void setWhoms(List<String> whoms) {
        this.whoms = whoms;
    }

    public List<String> getFairyWords() {
        return fairyWords;
    }

    public void setFairyWords(List<String> fairyWords) {
        this.fairyWords = fairyWords;
    }

    public List<String> getMainCharacters() {
        return mainCharacters;
    }

    public void setMainCharacters(List<String> mainCharacters) {
        this.mainCharacters = mainCharacters;
    }

}
