package by.epam.preTraining.harshunou.model.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Text extends TextEntity {
    private ArrayList<Paragraph> paragraphs;

    public Text() {
        this.paragraphs = new ArrayList<>();
    }

    public Text(ArrayList<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
        buildString();
    }

    public Text(String text) {
        this.paragraphs = new ArrayList<>();
        this.string = text;
    }

    //Getters
    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }

    //Setters
    public void setParagraphs(ArrayList<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
        buildString();
    }

    public String getText() {
        return string;
    }

    public void setText(String text) {
        this.string = text;
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }


    @Override
    public String buildString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Paragraph paragraph : paragraphs) {
            stringBuilder.append(paragraph.buildString());
        }
        this.string = stringBuilder.toString();
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(paragraphs, text.paragraphs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphs);
    }

    @Override
    public String toString() {
        return string;
    }
}
