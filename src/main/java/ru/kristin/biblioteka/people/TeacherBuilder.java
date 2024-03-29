package main.java.ru.kristin.biblioteka.people;



import java.util.ArrayList;
import java.util.List;
import main.java.ru.kristin.biblioteka.Library.Book;

public class TeacherBuilder extends Builder {

    private List<String> femaleTSurnames = new ArrayList<>();
    private List<String> maleTSurnames = new ArrayList<>();
    private List<String> secondNames = new ArrayList<>();
    private final String info = "C:\\Users\\krist\\Downloads\\Telegram Desktop\\все.csv";

    private String fullName;

    @Override
    public Builder bldFullName() {
        String ending;
        int indexOfName;
        int indexOfSurname;
        int indexOfSecondName = (int) Math.round(Math.random() * (secondNames.size() - 1));
        Integer randomSex = (int) Math.round(Math.random());
        if (randomSex.equals(0)) {
            indexOfName = (int) Math.round(Math.random() * (getFemaleNames().size() - 1));
            indexOfSurname = (int) Math.round(Math.random() * (femaleTSurnames.size() - 1));
            ending = "на";
            this.fullName = fullNameByGender(indexOfName, indexOfSurname, indexOfSecondName, getFemaleNames(), femaleTSurnames, secondNames, ending);
        }
        if (randomSex.equals(1)) {
            indexOfName = (int) Math.round(Math.random() * (getMaleNames().size() - 1));
            indexOfSurname = (int) Math.round(Math.random() * (maleTSurnames.size() - 1));
            ending = "ич";
            this.fullName = fullNameByGender(indexOfName, indexOfSurname, indexOfSecondName, getMaleNames(), maleTSurnames, secondNames, ending);
        }
        return this;

    }

    @Override
    public People bldUser(List<Book> books) {
        People user = new Teacher(fullName);
        List<Book> bk = new ArrayList<>(books);
        int quantityOfBooks = (int) Math.round(Math.random() * (10 - 3) + 3);
        for (int i = 1; i <= quantityOfBooks; i++) {
            int numberOfBook = (int) Math.round(Math.random() * (bk.size() - 1));
            user.getTakenBooks().add(bk.get(numberOfBook));
            bk.remove(numberOfBook);
        }
        return user;
    }

    @Override
    public void cleanInfo() {
        femaleTSurnames.clear();
        maleTSurnames.clear();
        secondNames.clear();
        getMaleNames().clear();
        getFemaleNames().clear();
    }

    @Override
    public void readInfo() {
        getProvider().readCommonInfo(info, this);
        getProvider().readTeacherInfo(info, this);
    }

    public String fullNameByGender(int indexOfName, int indexOfSurname, int indexOfSecondName, List<String> names, List<String> surnames,
            List<String> secondnames, String ending) {
        StringBuilder sb = new StringBuilder();
        return sb.append(surnames.get(indexOfSurname))
                .append(" ")
                .append(names.get(indexOfName))
                .append(" ")
                .append(secondnames.get(indexOfSecondName))
                .append(ending)
                .toString();
    }

    public List<String> getFemaleTSurnames() {
        return femaleTSurnames;
    }

    public void setFemaleTSurnames(List<String> femaleTSurnames) {
        this.femaleTSurnames = femaleTSurnames;
    }

    public List<String> getMaleTSurnames() {
        return maleTSurnames;
    }

    public void setMaleTSurnames(List<String> maleTSurnames) {
        this.maleTSurnames = maleTSurnames;
    }

    public List<String> getSecondNames() {
        return secondNames;
    }

    public void setSecondNames(List<String> secondNames) {
        this.secondNames = secondNames;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
