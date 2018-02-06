package by.harshunou.SecondTask;

public class FiguresToWords {
    public static String transform(int count) {
        String resultString = "Error";
        if (count < 10) {
            resultString = decade(count);
        } else if (count >= 10 && count < 20) {
            resultString = tenAndMore(count);
        } else if (count >= 20 && count < 100) {
            resultString = dozens(count);
            resultString += decade(count);
        } else if (count >= 100 && count < 1000) {
            resultString = hundreds(count);
            if ((count %= 100) >= 10 && count < 20) {
                resultString += tenAndMore(count);
            } else if (count > 20 && count < 100) {
                resultString += dozens(count);
                resultString += decade(count);
            } else if (count < 10) {
                resultString += decade(count);
            }

        }
        return resultString;
    }


    private static String decade(int count) {
        String temporaryString = null;
        switch (count % 10) {
            case 0:
                temporaryString = "";
                break;
            case 1:
                temporaryString = " один";
                break;
            case 2:
                temporaryString = " два";
                break;
            case 3:
                temporaryString = " три";
                break;
            case 4:
                temporaryString = " четыре";
                break;
            case 5:
                temporaryString = " пять";
                break;
            case 6:
                temporaryString = " шесть";
                break;
            case 7:
                temporaryString = " семь";
                break;
            case 8:
                temporaryString = " восемь";
                break;
            case 9:
                temporaryString = " девять";
                break;
            default:
                temporaryString = "???";
        }
        return temporaryString;
    }

    private static String tenAndMore(int count) {
        String temporaryString = "???";
        switch (count) {
            case 10:
                temporaryString = " десять";
                break;
            case 11:
                temporaryString = " одиннадцать";
                break;
            case 12:
                temporaryString = " двенадцать";
                break;
            case 13:
                temporaryString = " тринадцать";
                break;
            case 14:
                temporaryString = " четырнадцать";
                break;
            case 15:
                temporaryString = " пятнадцать";
                break;
            case 16:
                temporaryString = " шестнадцать";
                break;
            case 17:
                temporaryString = " семнадцать";
                break;
            case 18:
                temporaryString = " восемнадцать";
                break;
            case 19:
                temporaryString = " девятнадцать";
                break;
            default:
                temporaryString = "???";
        }
        return temporaryString;
    }


    private static String dozens(int count) {
        String temporaryString = "???";
        switch (count / 10) {
            case 2:
                temporaryString = " двадцать";
                break;
            case 3:
                temporaryString = " тридцать";
                break;
            case 4:
                temporaryString = " сорок";
                break;
            case 5:
                temporaryString = " пятьдесят";
                break;
            case 6:
                temporaryString = " шестьдесят";
                break;
            case 7:
                temporaryString = " семьдесят";
                break;
            case 8:
                temporaryString = " восемьдесят";
                break;
            case 9:
                temporaryString = " девяносто";
                break;
            default:
                temporaryString = "???";
        }
        return temporaryString;
    }

    private static String hundreds(int count) {
        String temporaryString = "???";
        switch (count / 100) {
            case 1:
                temporaryString = "Сто";
                break;
            case 2:
                temporaryString = "Двести";
                break;
            case 3:
                temporaryString = "Триста";
                break;
            case 4:
                temporaryString = "Четыреста";
                break;
            case 5:
                temporaryString = "Пятьсот";
                break;
            case 6:
                temporaryString = "Шестьсот";
                break;
            case 7:
                temporaryString = "Семьсот";
                break;
            case 8:
                temporaryString = "Восемьсот";
                break;
            case 9:
                temporaryString = "Девятьсот";
                break;
            default:
                temporaryString = "???";
        }
        return temporaryString;
    }
}

