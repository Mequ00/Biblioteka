package main.java.ru.kristin.biblioteka.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import main.java.ru.kristin.biblioteka.Library.EnglishBookFactory;
import main.java.ru.kristin.biblioteka.Library.RussianBookFactory;
import main.java.ru.kristin.biblioteka.people.Builder;
import main.java.ru.kristin.biblioteka.people.StudentBuilder;
import main.java.ru.kristin.biblioteka.people.TeacherBuilder;


public class CsvProvider {

    public void readEnglishFictionBooksInfo(String path, EnglishBookFactory factory) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    factory.getFictionNames().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    factory.getFictionAuthors().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    factory.getYears().add(Integer.valueOf(str[2]));
                }
            }
        } catch (IOException e) {
        }

    }

    public void readEnglishEducationBooksInfo(String path, EnglishBookFactory factory) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    factory.getEducationNames().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    factory.getUniversities().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    factory.getEducationAuthors().add(str[2]);
                }
            }
        } catch (IOException e) {
        }

    }

    public void readRussianFictionBooksInfo(String path, RussianBookFactory factory) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    factory.getAdjectives().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    factory.getMainWords().add(str[1]);
                }
                if (str.length > 2 && !str[2].isBlank()) {
                    factory.getWhoms().add(str[2]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    factory.getFairyWords().add(str[3]);
                }
                if (str.length > 4 && !str[4].isBlank()) {
                    factory.getMainCharacters().add(str[4]);
                }
            }
        } catch (IOException e) {
        }

    }

    public void readRussianEducationBooksInfo(String path, RussianBookFactory factory) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 0 && !str[0].isBlank()) {
                    factory.getEducationNames().add(str[0]);
                }
                if (str.length > 1 && !str[1].isBlank()) {
                    factory.getTypes().add(str[1]);
                }

            }
        } catch (IOException e) {
        }
    }

    public void readCommonInfo(String path, Builder builder) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");

                if (str.length > 1 && !str[1].isBlank()) {
                    builder.getFemaleNames().add(str[1]);
                }
                if (str.length > 4 && !str[4].isBlank()) {
                    builder.getMaleNames().add(str[4]);
                }

            }
        } catch (IOException e) {
        }
    }

    public void readStudentInfo(String path, StudentBuilder builder) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");

                if (str.length > 0 && !str[0].isBlank()) {
                    builder.getFemaleSurnames().add(str[0]);
                }
                if (str.length > 3 && !str[3].isBlank()) {
                    builder.getMaleSurnames().add(str[3]);
                }
            }
        } catch (IOException e) {
        }
    }

    public void readTeacherInfo(String path, TeacherBuilder builder) {
        try ( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                if (str.length > 2 && !str[2].isBlank()) {
                    builder.getFemaleTSurnames().add(str[2]);
                }
                if (str.length > 5 && !str[5].isBlank()) {
                    builder.getMaleTSurnames().add(str[5]);
                }
                if (str.length > 6 && !str[6].isBlank()) {
                    builder.getSecondNames().add(str[6]);
                }
            }
        } catch (IOException e) {
        }
    }
}
