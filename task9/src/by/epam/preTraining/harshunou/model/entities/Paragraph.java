package by.epam.preTraining.harshunou.model.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Paragraph extends TextEntity {
    private ArrayList<Sentence> sentences;

    public Paragraph() {
        this.sentences = new ArrayList<>();
    }

    public Paragraph(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
        buildString();
    }

    public Paragraph(String paragraph) {
        this.sentences = new ArrayList<>();
        this.string = paragraph;
    }

    //Getters
    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    //Setters
    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
        buildString();
    }

    public String getParagraph() {
        return string;
    }

    public void setParagraph(String paragraph) {
        this.string = paragraph;
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    @Override
    public String buildString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Sentence sentence : sentences) {
            stringBuilder.append(sentence.buildString());
        }
        this.string = stringBuilder.toString();
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(sentences, paragraph.sentences);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sentences);
    }
}
