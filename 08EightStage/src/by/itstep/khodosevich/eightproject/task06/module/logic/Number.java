package by.itstep.khodosevich.eightproject.task06.module.logic;

public class Number {

    public static final String ONE = "one";
    public static final String TWO = "two";
    public static final String TREE = "tree";
    public static final String FOUR = "four";
    public static final String FIVE = "five";
    public static final String SIX = "six";
    public static final String SEVEN = "seven";
    public static final String EIGHT = "eight";
    public static final String NINE = "nine";
    public static final String TEN = "ten";

    public static final String ELEVEN = "eleven";
    public static final String TWELVE = "twelve";
    public static final String THIRTEEN = "thirteen";
    public static final String FOURTEEN = "fourteen";
    public static final String FIFTEEN = "fifteen";
    public static final String SIXTEEN = "sixteen";
    public static final String SEVENTEEN = "seventeen";
    public static final String EIGHTEEN = "eighteen";
    public static final String NINETEEN = "nineteen";

    public static final String  TWENTY= "twenty";
    public static final String  THIRTY= "thirty";
    public static final String  FOURTY= "fourty";
    public static final String  FIFTY= "fifty";
    public static final String  SIXTY= "sixty";
    public static final String  SEVENTY= "seventy";
    public static final String  EIGHTY= "eighty";
    public static final String  NINETY= "ninety";


    public static String getStringNumber(double number){

        int numberInt = (int)number;
        String result = "out of out bound";

        if(numberInt<1 || numberInt>999){
            return result;
        }

        int numberHundred = numberInt/100;
        int numberTen = (numberInt-numberHundred*100)/10;
        int numberTens = (numberInt-numberHundred*100);
        int numberOne = numberInt-numberHundred*100-numberTen*10;


        result = numberHundred>0?getStringOne(numberHundred)+" hundred ":"";

        if(numberTens>=1 && numberTens<=19){
            result += numberTens>0?getStringOne(numberTens):"";
        } else{
            result+= numberTen>0?getStringTen(numberTen)+"-":"";
            result+= numberOne>0?getStringOne(numberOne):"";
        }

        result = result.toLowerCase().trim();
        return result;
    }

    private static String getStringTen(int numberTen){

        String result = NINETY;

        switch (numberTen){
            case 2: result = TWENTY; break;
            case 3: result = THIRTY; break;
            case 4: result = FOURTY; break;
            case 5: result = FIFTY; break;
            case 6: result = SIXTY; break;
            case 7: result = SEVENTY; break;
            case 8: result = EIGHTY; break;
        }
        return result;
    }

    private static String getStringOne(int numberOne){

        String result = NINETEEN;

        switch (numberOne){
            case 1: result = ONE; break;
            case 2: result = TWO; break;
            case 3: result = TREE; break;
            case 4: result = FOUR; break;
            case 5: result = FIVE; break;
            case 6: result = SIX; break;
            case 7: result = SEVEN; break;
            case 8: result = EIGHT; break;
            case 9: result = NINE; break;
            case 10: result = TEN; break;
            case 11: result = ELEVEN; break;
            case 12: result = TWELVE; break;
            case 13: result = THIRTEEN; break;
            case 14: result = FOURTEEN; break;
            case 15: result = FIFTEEN; break;
            case 16: result = SIXTEEN; break;
            case 17: result = SEVENTEEN; break;
            case 18: result = EIGHTEEN; break;
        }
        return result;
    }



}
