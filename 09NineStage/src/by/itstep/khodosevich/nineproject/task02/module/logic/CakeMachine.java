package by.itstep.khodosevich.nineproject.task02.module.logic;

// 1. сделать константы с сюрпризом +
// 2. сделать метод по выводу сюрприза +
// 3. сделать метод по выводу результата +

import java.util.Random;

public class CakeMachine {

    public static final String SURPRISE_NUMBER_1 = "cup of milk";
    public static final String SURPRISE_NUMBER_2 = "snickers";
    public static final String SURPRISE_NUMBER_3 = "kinder surprise";
    public static final String SURPRISE_NUMBER_4 = "nutella";
    public static final String SURPRISE_NUMBER_5 = "sweets";
    public static final String SURPRISE_NUMBER_6 = "small chocolate";
    public static final String SURPRISE_NUMBER_7 = "cup of cacao";

    public static final int MIN_NUMBER_OF_SURPRISE = 1;
    public static final int MAX_NUMBER_OF_SURPRISE = 7;

    public static String getSurprise(int surpriseNumber){
        if(surpriseNumber < MIN_NUMBER_OF_SURPRISE || MAX_NUMBER_OF_SURPRISE <surpriseNumber){
            throw new RuntimeException();
        }

        String surprise = SURPRISE_NUMBER_7;

        switch (surpriseNumber){
            case 1: surprise = SURPRISE_NUMBER_1;break;
            case 2: surprise = SURPRISE_NUMBER_2;break;
            case 3: surprise = SURPRISE_NUMBER_3;break;
            case 4: surprise = SURPRISE_NUMBER_4;break;
            case 5: surprise = SURPRISE_NUMBER_5;break;
            case 6: surprise = SURPRISE_NUMBER_6;break;
        }
        return surprise;
    }

    public static String getCakeWithSurprise(){
        Random random = new Random();
        int surpriseNumber = (random.nextInt(MAX_NUMBER_OF_SURPRISE-MIN_NUMBER_OF_SURPRISE+1)
                +MIN_NUMBER_OF_SURPRISE);

        String cakeWithSurprise = String.format("You get cake with %s.", getSurprise(surpriseNumber));

        return cakeWithSurprise;
    }

}
