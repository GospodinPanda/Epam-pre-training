package by.epam.preTraining.harshunou.utils.parser;

public abstract class Parser {
    protected String string;

    public Parser() {

    }

    public Parser(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


    public abstract void parse();

}
