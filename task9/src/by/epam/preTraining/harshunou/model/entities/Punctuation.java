package by.epam.preTraining.harshunou.model.entities;

public class Punctuation extends Symbol {
    public Punctuation() {
    }

    public Punctuation(String string) {
        this.string = string;
    }

    public String getPunct() {
        return string;
    }

    public void setPunct(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}

