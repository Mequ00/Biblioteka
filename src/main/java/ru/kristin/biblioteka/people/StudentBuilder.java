package main.java.ru.kristin.biblioteka.people;



import java.util.ArrayList;
import java.util.List;
import main.java.ru.kristin.biblioteka.Library.Book;

public class StudentBuilder extends Builder {

    private List<String> maleSurnames = new ArrayList<>();
    private List<String> femaleSurnames = new ArrayList<>();
    private final String info = "C:\\Users\\krist\\Downloads\\Telegram Desktop\\все.csv";

    private String fullName;

    @Override
    public Builder bldFullName() {
        StringBuilder sb = new StringBuilder();
        int indexOfName = 0;
        int indexOfSurname = 0;
        Integer randomSex = (int) Math.round(Math.random());
        if (randomSex.equals(0)) {
            indexOfName = (int) Math.round(Math.random() * (getFemaleNames().size() - 1));
            indexOfSurname = (int) Math.round(Math.random() * (getFemaleSurnames().size() - 1));
            this.fullName = sb.append(getFemaleSurnames().get(indexOfSurname))
                    .append(" ")
                    .append(getFemaleNames().get(indexOfName))
                    .toString();
        }
        if (randomSex.equals(1)) {
            indexOfName = (int) Math.round(Math.random() * (getMaleNames().size() - 1));
            indexOfSurname = (int) Math.round(Math.random() * (getMaleSurnames().size() - 1));
            this.fullName = sb.append(getMaleSurnames().get(indexOfSurname))
                    .append(" ")
                    .append(getMaleNames().get(indexOfName))
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

    @Override
    public void readInfo() {
        getProvider().readCommonInfo(info, this);
        getProvider().readStudentInfo(info, this);
    }

    @Override
    public void cleanInfo() {
        maleSurnames.clear();
        femaleSurnames.clear();
        getMaleNames().clear();
        getFemaleNames().clear();
    }

    public List<String> getMaleSurnames() {
        return maleSurnames;
    }

    public void setMaleSurnames(List<String> maleSurnames) {
        this.maleSurnames = maleSurnames;
    }

    public List<String> getFemaleSurnames() {
        return femaleSurnames;
    }

    public void setFemaleSurnames(List<String> femaleSurnames) {
        this.femaleSurnames = femaleSurnames;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
