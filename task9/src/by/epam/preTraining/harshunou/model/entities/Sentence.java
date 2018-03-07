package by.epam.preTraining.harshunou.model.entities;

import java.util.ArrayList;
import java.util.Objects;

public class Sentence extends TextEntity {
    ArrayList<PartOfSentence> partOfSentences;


    public Sentence() {
        partOfSentences = new ArrayList<>();
    }

    public Sentence(String sentence) {
        this.partOfSentences = new ArrayList<>();
        this.string = sentence;
    }

    public Sentence(ArrayList<PartOfSentence> partOfSentences) {
        this.partOfSentences = partOfSentences;
        buildString();
    }


    public String getSentence() {
        return string;
    }

    public ArrayList<PartOfSentence> getPartOfSentences() {
        return partOfSentences;
    }

    public void addPart(PartOfSentence sentenceParts) {
        this.partOfSentences.add(sentenceParts);
    }

    @Override
    public String buildString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (PartOfSentence part : partOfSentences) {
            stringBuilder.append(part instanceof Word ? (part.buildString() + " ") : part.buildString());
        }
        this.string = stringBuilder.toString();
        return string;
    }

    @Override
    public String toString() {
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(partOfSentences, sentence.partOfSentences);
    }

    @Override
    public int hashCode() {

        return Objects.hash(partOfSentences);
    }
}
