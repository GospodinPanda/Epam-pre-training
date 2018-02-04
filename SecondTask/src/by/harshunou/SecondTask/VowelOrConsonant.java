package by.harshunou.SecondTask;

public class VowelOrConsonant {
    public static final String VOWEL = "Vowel";
    public static final String CONSONANT = "Consonant";
    public static final String VOWEL_RUS = "Гласная";
    public static final String CONSONANT_RUS = "Согласная";

    public static String checkTheLetter(char c) {
        if (c >= 65 && c <= 122) {
            return checkViaAsciiEnglish(c);
        } else if (c > 192) {
            return checkViaAsciiRussian(c);
        } else {
            return "error symbol";
        }
    }

    public static String checkViaSwitchRussianVowel(char c) {
        switch (c) {
            case 'А':
                return VOWEL_RUS;
            case 'Е':
                return VOWEL_RUS;
            case 'Ё':
                return VOWEL_RUS;
            case 'И':
                return VOWEL_RUS;
            case 'О':
                return VOWEL_RUS;
            case 'У':
                return VOWEL_RUS;
            case 'Я':
                return VOWEL_RUS;
            case 'Ю':
                return VOWEL_RUS;
            case 'Ы':
                return VOWEL_RUS;
            case 'Э':
                return VOWEL_RUS;
            case 'а':
                return VOWEL_RUS;
            case 'е':
                return VOWEL_RUS;
            case 'ё':
                return VOWEL_RUS;
            case 'и':
                return VOWEL_RUS;
            case 'о':
                return VOWEL_RUS;
            case 'у':
                return VOWEL_RUS;
            case 'я':
                return VOWEL_RUS;
            case 'э':
                return VOWEL_RUS;
            case 'ю':
                return VOWEL_RUS;
            case 'ы':
                return VOWEL_RUS;
            default:
                return CONSONANT_RUS;
        }
    }

    public static String checkViaSwitchRussianConsonant(char c) {
        switch (c) {
            case 'Б':
                return CONSONANT_RUS;
            case 'В':
                return CONSONANT_RUS;
            case 'Г':
                return CONSONANT_RUS;
            case 'Д':
                return CONSONANT_RUS;
            case 'Ж':
                return CONSONANT_RUS;
            case 'З':
                return CONSONANT_RUS;
            case 'К':
                return CONSONANT_RUS;
            case 'Л':
                return CONSONANT_RUS;
            case 'М':
                return CONSONANT_RUS;
            case 'Н':
                return CONSONANT_RUS;
            case 'П':
                return CONSONANT_RUS;
            case 'Р':
                return CONSONANT_RUS;
            case 'Ф':
                return CONSONANT_RUS;
            case 'Х':
                return CONSONANT_RUS;
            case 'Ь':
                return CONSONANT_RUS;
            case 'Ъ':
                return CONSONANT_RUS;
            case 'Ц':
                return CONSONANT_RUS;
            case 'Щ':
                return CONSONANT_RUS;
            case 'Ш':
                return CONSONANT_RUS;
            case 'Т':
                return CONSONANT_RUS;
            case 'Ч':
                return CONSONANT_RUS;
            case 'С':
                return CONSONANT_RUS;
            case 'б':
                return CONSONANT_RUS;
            case 'в':
                return CONSONANT_RUS;
            case 'г':
                return CONSONANT_RUS;
            case 'д':
                return CONSONANT_RUS;
            case 'ж':
                return CONSONANT_RUS;
            case 'з':
                return CONSONANT_RUS;
            case 'к':
                return CONSONANT_RUS;
            case 'л':
                return CONSONANT_RUS;
            case 'м':
                return CONSONANT_RUS;
            case 'н':
                return CONSONANT_RUS;
            case 'п':
                return CONSONANT_RUS;
            case 'р':
                return CONSONANT_RUS;
            case 'ф':
                return CONSONANT_RUS;
            case 'х':
                return CONSONANT_RUS;
            case 'ь':
                return CONSONANT_RUS;
            case 'ъ':
                return CONSONANT_RUS;
            case 'ц':
                return CONSONANT_RUS;
            case 'ш':
                return CONSONANT_RUS;
            case 'щ':
                return CONSONANT_RUS;
            case 'т':
                return CONSONANT_RUS;
            case 'ч':
                return CONSONANT_RUS;
            case 'с':
                return CONSONANT_RUS;
            default:
                return VOWEL_RUS;
        }
    }

    public static String checkViaSwitchEnglishVowel(char c) {
        switch (c) {
            case 'a':
                return VOWEL;
            case 'u':
                return VOWEL;
            case 'i':
                return VOWEL;
            case 'e':
                return VOWEL;
            case 'o':
                return VOWEL;
            case 'A':
                return VOWEL;
            case 'E':
                return VOWEL;
            case 'O':
                return VOWEL;
            case 'I':
                return VOWEL;
            case 'U':
                return VOWEL;
            default:
                return CONSONANT;
        }
    }

    public static String checkViaSwitchEnglishConsonant(char c) {
        switch (c) {
            case 'b':
                return CONSONANT;
            case 'c':
                return CONSONANT;
            case 'd':
                return CONSONANT;
            case 'f':
                return CONSONANT;
            case 'g':
                return CONSONANT;
            case 'h':
                return CONSONANT;
            case 'j':
                return CONSONANT;
            case 'k':
                return CONSONANT;
            case 'l':
                return CONSONANT;
            case 'm':
                return CONSONANT;
            case 'x':
                return CONSONANT;
            case 'z':
                return CONSONANT;
            case 'n':
                return CONSONANT;
            case 'p':
                return CONSONANT;
            case 'q':
                return CONSONANT;
            case 'r':
                return CONSONANT;
            case 's':
                return CONSONANT;
            case 't':
                return CONSONANT;
            case 'v':
                return CONSONANT;
            case 'w':
                return CONSONANT;
            case 'B':
                return CONSONANT;
            case 'C':
                return CONSONANT;
            case 'D':
                return CONSONANT;
            case 'F':
                return CONSONANT;
            case 'G':
                return CONSONANT;
            case 'H':
                return CONSONANT;
            case 'J':
                return CONSONANT;
            case 'K':
                return CONSONANT;
            case 'L':
                return CONSONANT;
            case 'M':
                return CONSONANT;
            case 'X':
                return CONSONANT;
            case 'Z':
                return CONSONANT;
            case 'N':
                return CONSONANT;
            case 'P':
                return CONSONANT;
            case 'Q':
                return CONSONANT;
            case 'R':
                return CONSONANT;
            case 'S':
                return CONSONANT;
            case 'T':
                return CONSONANT;
            case 'V':
                return CONSONANT;
            case 'W':
                return CONSONANT;
            default:
                return VOWEL;
        }
    }

    public static String checkViaAsciiEnglish(char c) {
        if (c == 97 || c == 65 || c == 101 || c == 69 || c == 105 || c == 73
                || c == 111 || c == 79 || c == 85 || c == 117)
            return VOWEL;
        else {
            return CONSONANT;
        }
    }

    public static String checkViaAsciiRussian(char c) {
        if (c == 1040 || c == 1072 || c == 1045 || c == 1077 || c == 1048
                || c == 1080 || c == 1054 || c == 1086 || c == 1059
                || c == 1091 || c == 1067 || c == 1099 || c == 1070 || c == 1102 || c == 1071 || c == 1103) {
            return VOWEL_RUS;
        } else {
            return CONSONANT_RUS;
        }
    }

}
