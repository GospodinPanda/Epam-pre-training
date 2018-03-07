package by.epam.preTraining.harshunou.utils.parser;

import by.epam.preTraining.harshunou.model.entities.Paragraph;

public class ParagraphParser extends Parser {
    private final static String REGEXP = "(?<=[.|?|!])[\\s|\\n]?";
    private Paragraph paragraph;

    public ParagraphParser() {
    }

    public ParagraphParser(String paragraph) {
        super(paragraph);
    }

    //Getters
    public Paragraph getParagraph() {
        return paragraph;
    }

    @Override
    public void parse() {
        paragraph = new Paragraph();
        String[] sentences = string.split(REGEXP);
        int length = sentences.length;
        SentenceParser parser = new SentenceParser();
        for (int i = 0; i < length; i++) {
            parser.setString(sentences[i]);
            parser.parse();
            paragraph.addSentence(parser.getSentence());
        }
    }

}
