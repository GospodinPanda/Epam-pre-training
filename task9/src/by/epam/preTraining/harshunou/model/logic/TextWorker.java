package by.epam.preTraining.harshunou.model.logic;

import by.epam.preTraining.harshunou.model.entities.Paragraph;
import by.epam.preTraining.harshunou.model.entities.PartOfSentence;
import by.epam.preTraining.harshunou.model.entities.Sentence;
import by.epam.preTraining.harshunou.model.entities.Word;
import by.epam.preTraining.harshunou.utils.parser.TextParser;

import java.util.ArrayList;

public class TextWorker {
    TextParser textParser;

    public TextWorker(String string) {
        this.textParser = new TextParser(string);
        textParser.parse();
    }

    public String getText() {
        return textParser.toString();
    }

    public String changeFirstAndLast() {
        StringBuilder result = new StringBuilder();
        ArrayList<Paragraph> paragraphs = textParser.getText().getParagraphs();
        for (Paragraph paragraph : paragraphs) {
            ArrayList<Sentence> sentences = paragraph.getSentences();
            for (Sentence sentence : sentences) {
                ArrayList<PartOfSentence> parts = sentence.getPartOfSentences();
                PartOfSentence wordTemp = new Word(parts.get(0).toString());
                parts.set(0, parts.get(parts.size() - 2));
                parts.set(parts.size() - 2, wordTemp);
                for (PartOfSentence part :
                        parts) {
                    result.append(part.toString()).append(" ");
                }
            }
        }
        return result.toString();
    }

    public String deleteConsonantWords(int length) {
        return textParser.getText().toString().replaceAll("\\b[\\s][^(?i)auioy][a-zA-Z]{" + (length - 1) + "}[.|?|!]?\\b", "");
    }

}

