package by.epam.preTraining.harshunou.model.entities;

public class Letter extends Symbol {
    public Letter() {
    }

    public Letter(String string) {
        this.string = string;
    }

    public String getLetter() {
        return string;
    }

    public void setLetter(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
