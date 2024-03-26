package main.java.ru.kristin.biblioteka.Library;

import main.java.ru.kristin.biblioteka.Library.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RussianBookFactory implements Bookfactory {
    private static List<String> educationNames = new ArrayList<>();
    private static List<String> types = new ArrayList<>();
    private static List<String> adjectives  = new ArrayList<>();
    private static List<String> mainWords = new ArrayList<>();
    private static List<String> whoms = new ArrayList<>();
    private static List<String> fairyWords = new ArrayList<>();
    private static List<String> mainCharacters = new ArrayList<>();
    
    
    

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
        String fullName  = null;
        Random random = new Random();
        switch (random.nextInt(2)) {
            case 0 -> {
                String adjective = adjectives.get(random.nextInt(adjectives.size()));
                String mainWord = mainWords.get(random.nextInt(mainWords.size()));
                String whom = whoms.get(random.nextInt(whoms.size()));
                fullName = adjective + " " + mainWord  + " " + whom;
            }
            case 1 ->{
                String fairyWord = fairyWords.get(random.nextInt(fairyWords.size()));
                String mainCharacter = mainCharacters.get(random.nextInt(mainCharacters.size()));
                fullName = fairyWord + " о " + mainCharacter;
            }
        }
        return new RussianFiction(fullName);
    }

    public static List<String> getEducationNames() {
        return educationNames;
    }

    public static void setEducationNames(List<String> educationNames) {
        RussianBookFactory.educationNames = educationNames;
    }

    public static List<String> getTypes() {
        return types;
    }

    public static void setTypes(List<String> types) {
        RussianBookFactory.types = types;
    }

    public static List<String> getAdjectives() {
        return adjectives;
    }

    public static void setAdjectives(List<String> adjectives) {
        RussianBookFactory.adjectives = adjectives;
    }

    public static List<String> getMainWords() {
        return mainWords;
    }

    public static void setMainWords(List<String> mainWords) {
        RussianBookFactory.mainWords = mainWords;
    }

    public static List<String> getWhoms() {
        return whoms;
    }

    public static void setWhoms(List<String> whoms) {
        RussianBookFactory.whoms = whoms;
    }

    public static List<String> getFairyWords() {
        return fairyWords;
    }

    public static void setFairyWords(List<String> fairyWords) {
        RussianBookFactory.fairyWords = fairyWords;
    }

    public static List<String> getMainCharacters() {
        return mainCharacters;
    }

    public static void setMainCharacters(List<String> mainCharacters) {
        RussianBookFactory.mainCharacters = mainCharacters;
    }
    
    
}
