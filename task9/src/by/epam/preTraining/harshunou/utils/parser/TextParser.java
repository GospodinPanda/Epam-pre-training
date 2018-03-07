package by.epam.preTraining.harshunou.utils.parser;

import by.epam.preTraining.harshunou.model.entities.Text;

import java.util.Objects;

public class TextParser extends Parser {

    private final static String REGEXP = "(\\n)";
    private Text text;

    public TextParser() {
    }

    public TextParser(String text) {
        super(text);
    }

    //Getters
    public Text getText() {
        return text;
    }

    @Override
    public void parse() {
        text = new Text(string);
        String s = string.toString();
        String[] paragraphs = s.split(REGEXP);
        ParagraphParser parser = new ParagraphParser();
        int length = paragraphs.length;
        for (int i = 0; i < length; i++) {
            parser.setString(paragraphs[i]);
            parser.parse();
            text.addParagraph(parser.getParagraph());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextParser that = (TextParser) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return text.getText();
    }
}
