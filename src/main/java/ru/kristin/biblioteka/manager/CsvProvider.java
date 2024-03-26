package main.java.ru.kristin.biblioteka.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import main.java.ru.kristin.biblioteka.Library.EnglishBookFactory;
import main.java.ru.kristin.biblioteka.Library.RussianBookFactory;
import main.java.ru.kristin.biblioteka.people.Builder;

public class CsvProvider {

    public void cleanAll() {
        EnglishBookFactory.getFictionNames().clear();
        EnglishBookFactory.getFictionAuthors().clear();
        EnglishBookFactory.getYears().clear();
        EnglishBookFactory.getEducationNames().clear();
        EnglishBookFactory.getUniversities().clear();
        EnglishBookFactory.getEducationAuthors().clear();
        
        RussianBookFactory.getAdjectives().clear();
        RussianBookFactory.getEducationNames().clear();
        RussianBookFactory.getFairyWords().clear();
        RussianBookFactory.getMainCharacters().clear();
        RussianBookFactory.getMainWords().clear();
        RussianBookFactory.getTypes().clear();
        RussianBookFactory.getWhoms().clear();
        
        Builder.femaleNames.clear();
        Builder.femaleSurnames.clear();
        Builder.femaleTSurnames.clear();
        Builder.maleNames.clear();
        Builder.maleSurnames.clear();
        Builder.maleTSurnames.clear();
        Builder.secondNames.clear();
        
    }

    public void readEnglishFictionBooksInfo(String path) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    EnglishBookFactory.getFictionNames().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    EnglishBookFactory.getFictionAuthors().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    EnglishBookFactory.getYears().add(Integer.valueOf(str[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readEnglishEducationBooksInfo(String path) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    EnglishBookFactory.getEducationNames().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    EnglishBookFactory.getUniversities().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    EnglishBookFactory.getEducationAuthors().add(str[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readRussianFictionBooksInfo(String path) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    RussianBookFactory.getAdjectives().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    RussianBookFactory.getMainWords().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    RussianBookFactory.getWhoms().add(str[2]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    RussianBookFactory.getFairyWords().add(str[3]);
                }
                if (str.length > 4 && !str[4].isBlank()) {
                    RussianBookFactory.getMainCharacters().add(str[4]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readRussianEducationBooksInfo(String path) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    RussianBookFactory.getEducationNames().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    RussianBookFactory.getTypes().add(str[1]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPeopleInfo(String path) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    Builder.femaleSurnames.add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    Builder.femaleNames.add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    Builder.femaleTSurnames.add(str[2]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    Builder.maleSurnames.add(str[3]);
                }
                if (str.length > 4 && !str[4].isBlank()) {
                    Builder.maleNames.add(str[4]);
                }
                if (str.length > 5 && !str[5].isBlank()) {
                    Builder.maleTSurnames.add(str[5]);
                }
                if (str.length > 6 && !str[6].isBlank()) {
                    Builder.secondNames.add(str[6]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
