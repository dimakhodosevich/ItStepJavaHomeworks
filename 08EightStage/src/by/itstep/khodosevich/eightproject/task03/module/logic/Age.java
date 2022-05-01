package by.itstep.khodosevich.eightproject.task03.module.logic;

public class Age {

    public static final String ONE = "Один";
    public static final String TWO = "Два";
    public static final String TREE = "Три";
    public static final String FOUR = "Четыре";
    public static final String FIVE = "Пять";
    public static final String SIX = "Шесть";
    public static final String SEVEN = "Семь";
    public static final String EIGHT = "Восемь";
    public static final String NINE = "Девять";
    public static final String TEN = "Десять";

    public static final String ELEVEN = "Одинадцать";
    public static final String TWELVE = "Двенадцать";
    public static final String THIRTEEN = "Тринадцать";
    public static final String FOURTEEN = "Четырнадцать";
    public static final String FIFTEEN = "Пятнадцать";
    public static final String SIXTEEN = "Шестнадцать";
    public static final String SEVENTEEN = "Семьнадцать";
    public static final String EIGHTEEN = "Восемнадцать";
    public static final String NINETEEN = "Девятнадцать";

    public static final String TWENTY = "Двадцать";
    public static final String THIRTY = "Тридцать";
    public static final String FOURTY = "Сорок";
    public static final String FIFTY = "Пятьдесят";
    public static final String SIXTY = "Шестьдесят";
    public static final String SEVENTY = "Семьдесят";
    public static final String EIGHTY = "Восемьдесят";
    public static final String NINETY = "Девяноста";

    public static final String ONE_HUNDRED = "Сто";

    public static final String ONE_YEAR = "Год"; //1
    public static final String MANY_YEAR = "Года"; //2,3,4
    public static final String MUCH_YEAR = "Лет"; //


    public static String getStringAge(double age) {

        if (age < 1 || age > 120) {
            throw new RuntimeException();
        }

        int ageInt = (int) age;

        int ageHundred = ageInt / 100;
        int ageTen = (ageInt - ageHundred * 100) / 10;
        int ageTenUnit = (ageInt - ageHundred * 100);
        int ageUnit = ageInt - ageHundred * 100 - ageTen * 10;

        String result = "";
        result += ageHundred > 0 ? getStringAgeHundred(ageHundred) : ("");
        if (ageTenUnit < 20) {
            result += ageTenUnit > 0 ? getStringAgeUnit(ageTenUnit) : ("");
        } else {
            result += ageTen > 0 ? getStringAgeTen(ageTen) : ("");
            result += ageUnit > 0 ? getStringAgeUnit(ageUnit) : ("");
        }

        result += getStringEnding(ageInt);
        result = result.toLowerCase().trim();

        return result;
    }

    private static String getStringAgeHundred(int ageHundred) {
        return ONE_HUNDRED + " ";
    }

    private static String getStringAgeTen(int ageTen) {

        String result = "";

        switch (ageTen) {
            case 2:
                result = TWENTY;
                break;
            case 3:
                result = THIRTY;
                break;
            case 4:
                result = FOURTY;
                break;
            case 5:
                result = FIFTY;
                break;
            case 6:
                result = SIXTY;
                break;
            case 7:
                result = SEVENTY;
                break;
            case 8:
                result = EIGHTY;
                break;
            case 9:
                result = NINETY;
                break;
        }
        return result + " ";
    }

    private static String getStringAgeUnit(int ageUnit) {

        String result = "";

        switch (ageUnit) {
            case 1:
                result = ONE;
                break;
            case 2:
                result = TWO;
                break;
            case 3:
                result = TREE;
                break;
            case 4:
                result = FOUR;
                break;
            case 5:
                result = FIVE;
                break;
            case 6:
                result = SIX;
                break;
            case 7:
                result = SEVEN;
                break;
            case 8:
                result = EIGHT;
                break;
            case 9:
                result = NINE;
                break;
            case 10:
                result = TEN;
                break;
            case 11:
                result = ELEVEN;
                break;
            case 12:
                result = TWELVE;
                break;
            case 13:
                result = THIRTEEN;
                break;
            case 14:
                result = FOURTEEN;
                break;
            case 15:
                result = FIFTEEN;
                break;
            case 16:
                result = SIXTEEN;
                break;
            case 17:
                result = SEVENTEEN;
                break;
            case 18:
                result = EIGHTEEN;
                break;
            case 19:
                result = NINETEEN;
                break;
        }
        return result + " ";
    }

    private static String getStringEnding(int age) {

        String result = MUCH_YEAR;

        int ageTemp = age;
        ageTemp %= 10;

        if (ageTemp == 1 && !(age>=11 && age<=19)) {
            result = ONE_YEAR;
        } else if (ageTemp > 1 && ageTemp < 5 && !(age>=11 && age<=19)) {
            result = MANY_YEAR;
        }

        return result;
    }


}
