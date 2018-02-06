package by.harshunou.SecondTask;

public class VowelOrConsonant {
    public static final String VOWEL = "Vowel";
    public static final String CONSONANT = "Consonant";
    public static final String VOWEL_RUS = "Гласная";
    public static final String CONSONANT_RUS = "Согласная";
    public static final String VOWEL_STRING = "auioey";

    public static String checkTheLetter(char c) {
        String resultString="error symbol";
        if (c >= 65 && c <= 122) {
            resultString= checkViaAsciiEnglish(c);
        } else if (c > 192) {
            resultString= checkViaAsciiRussian(c);
        } else {
            resultString= "error symbol";
        }
        return resultString;
    }

    public static String checkViaSwitchRussianVowel(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'а':
            case 'е':
            case 'ё':
            case 'и':
            case 'о':
            case 'у':
            case 'я':
            case 'э':
            case 'ю':
            case 'ы':
                return VOWEL_RUS;
            default:
                return CONSONANT_RUS;
        }
    }

    public static String checkViaSwitchRussianConsonant(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'б':
            case 'в':
            case 'г':
            case 'д':
            case 'ж':
            case 'з':
            case 'к':
            case 'л':
            case 'м':
            case 'н':
            case 'п':
            case 'р':
            case 'ф':
            case 'х':
            case 'ь':
            case 'ъ':
            case 'ц':
            case 'ш':
            case 'щ':
            case 'т':
            case 'ч':
            case 'с':
                return CONSONANT_RUS;
            default:
                return VOWEL_RUS;
        }
    }

    public static String checkViaSwitchEnglishVowel(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'a':
            case 'u':
            case 'i':
            case 'e':
            case 'o':
            case 'y':
                return VOWEL;
            default:
                return CONSONANT;
        }
    }

    public static String checkViaSwitchEnglishConsonant(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'x':
            case 'z':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
                return CONSONANT;
            default:
                return VOWEL;
        }
    }

    public static String checkViaAsciiEnglish(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'y')
            return VOWEL;
        else {
            return CONSONANT;
        }
    }

    public static String checkViaAsciiRussian(char c) {
        c = Character.toLowerCase(c);
        if (c == 'а' || c == 'е' || c == 'у' || c == 'я' || c == 'э'
                || c == 'и' || c == 'о' || c == 'ы' || c == 'ю') {
            return VOWEL_RUS;
        } else {
            return CONSONANT_RUS;
        }
    }

    public static String checkViaContains(char c) {
        String letter = "" + Character.toLowerCase(c);
        if (VOWEL_STRING.contains(letter)) {
            return VOWEL;
        } else {
            return CONSONANT;
        }
    }
}
