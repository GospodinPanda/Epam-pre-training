package by.epam.preTraining.harshunou.utils.parser;

import by.epam.preTraining.harshunou.model.entities.Letter;
import by.epam.preTraining.harshunou.model.entities.Word;

public class WordParser extends Parser {
    private Word word;

    public WordParser() {

    }

    public WordParser(String string) {
        super(string);
    }

    public Word getWord() {
        return word;
    }

    @Override
    public void parse() {
        word = new Word(string);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            word.addLetter(new Letter(string.substring(i, i + 1)));
        }
    }
}
