package by.epam.preTraining.harshunou.utils.parser;


import by.epam.preTraining.harshunou.model.entities.Punctuation;
import by.epam.preTraining.harshunou.model.entities.Sentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser extends Parser {
    private final static String SYMBOL_SPLITTER = "[\\s]+";
    private final static String WORD_REGEXP = "[a-zA-Z][a-zA-Z_-]*";
    private final static String MARK_REGEXP = "[.|?|!]+";
    private Sentence sentence;

    public SentenceParser() {

    }

    public SentenceParser(String string) {
        super(string);
    }

    public Sentence getSentence() {
        return sentence;
    }

    @Override
    public void parse() {
        sentence = new Sentence();
        String[] components = string.split(SYMBOL_SPLITTER);
        WordParser lp = new WordParser();
        Pattern wordPattern = Pattern.compile(WORD_REGEXP);
        Pattern markPattern = Pattern.compile(MARK_REGEXP);
        for (String component : components) {
            Matcher wordMatcher = wordPattern.matcher(component);
            Matcher markMatcher = markPattern.matcher(component);
            while (wordMatcher.find()) {
                lp.setString(wordMatcher.group());
                lp.parse();
                sentence.addPart(lp.getWord());
            }
            while (markMatcher.find()) {
                sentence.addPart(new Punctuation(markMatcher.group()));
            }
        }


    }


}