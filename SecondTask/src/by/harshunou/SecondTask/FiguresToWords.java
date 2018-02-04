package by.harshunou.SecondTask;

public class FiguresToWords {
    public static String transform(int count) {
        String string = "Ошибка";
        if (count < 10) {
            return decade(count);
        } else if (count >= 10 && count < 20) {
            string = tenAndMore(count);
            return (string);
        } else if (count >= 20 && count < 100) {
            string = tenAndMore(count);
            string += decade(count);
            return string;
        } else if (count >= 100 && count < 1000) {
            string = null;
           string=hundreds(count);
            count %= 100;
            if (count >= 10 && count < 20) {
                string += tenAndMore(count);

            } else if (count > 20 && count < 100) {
                string += tenAndMore(count);
                string += decade(count);

            }
            return string;
        }
        else {
            return "error";
        }
    }


    private static String decade(int count) {
        switch (count % 10) {
            case 0:
                return "";
            case 1:
                return " один";

            case 2:
                return " два";

            case 3:
                return " три";

            case 4:
                return " четыре";

            case 5:
                return " пять";

            case 6:
                return " шесть";

            case 7:
                return " семь";

            case 8:
                return " восемь";

            case 9:
                return " девять";
            default:
                return "???";
        }
    }

    private static String tenAndMore(int count) {
        if (count >= 10 && count < 20) {
            switch (count) {
                case 10:
                    return " десять";
                case 11:
                    return " одиннадцать";
                case 12:
                    return " двенадцать";
                case 13:
                    return " тринадцать";
                case 14:
                    return " четырнадцать";
                case 15:
                    return " пятнадцать";
                case 16:
                    return " шестнадцать";
                case 17:
                    return " семнадцать";
                case 18:
                    return " восемнадцать";
                case 19:
                    return " девятнадцать";
                default:
                    return "???";
            }
        } else if (count > 20 && count < 100) {
            switch (count / 10) {
                case 2:
                    return " двадцать";
                case 3:
                    return " тридцать";
                case 4:
                    return " сорок";
                case 5:
                    return " пятьдесят";
                case 6:
                    return " шестьдесят";
                case 7:
                    return " семьдесят";
                case 8:
                    return " восемьдесят";
                case 9:
                    return " девяносто";
                default:
                    return "???";
            }
        } else {
            return "error";
        }
    }

    private static String hundreds(int count) {
        switch (count / 100) {
            case 1:
                return "Сто";
            case 2:
                return "Двести";
            case 3:
                return "Триста";
            case 4:
                return "Четыреста";
            case 5:
                return "Пятьсот";
            case 6:
                return "Шестьсот";
            case 7:
                return "Семьсот";
            case 8:
                return "Восемьсот";
            case 9:
                return "Девятьсот";
            default:
                return "???";
        }
    }
}
