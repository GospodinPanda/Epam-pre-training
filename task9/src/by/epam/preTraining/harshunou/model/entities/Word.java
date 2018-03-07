package by.epam.preTraining.harshunou.model.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Word extends PartOfSentence {
    private ArrayList<Letter> letters;


    public Word() {
        this.letters = new ArrayList<>();
    }

    public Word(String word) {
        this.letters = new ArrayList<>();
        this.string = word;
    }

    public Word(ArrayList<Letter> letters) {
        this.letters = letters;
        buildString();
    }

    public void addLetter(Letter letter) {
        letters.add(letter);
    }

    //Getters
    public ArrayList<Letter> getLetters() {
        return letters;
    }

    public void setLetters(ArrayList<Letter> letters) {
        this.letters = letters;
        buildString();
    }

    public String getWord() {
        return string;
    }

    public void setWord(String word) {
        this.string = word;
        this.letters = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(letters, word.letters);
    }

    @Override
    public int hashCode() {

        return Objects.hash(letters);
    }

    @Override
    public String buildString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Letter letter : letters) {
            stringBuilder.append(letter);
        }
        this.string = stringBuilder.toString();
        return string;
    }

    @Override
    public String toString() {
        return string;
    }
}
