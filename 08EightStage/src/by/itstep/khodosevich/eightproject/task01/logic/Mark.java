package by.itstep.khodosevich.eightproject.task01.logic;

public class Mark {

    public static final String VERY_BAD_MARK = "Very bad mark.";                // mark = 0-1;
    public static final String UNSATISFACTORY_MARK = "Unsatisfactory mark.";    // mark = 2-3;
    public static final String SATISFACTORY_MARK = "Satisfactory mark.";        // mark = 4;
    public static final String NOT_BAD_MARK = "Not bad mark.";                  // mark = 5-6;
    public static final String NICE_MARK = "Nice mark.";                         // mark = 7-8;
    public static final String Great_MARK = "Great mark.";                       // mark = 9;
    public static final String AWESOME_MARK = "Awesome mark.";                   // mark = 10;


    public static String getStringEquivalentOfMark(int mark){

        if(mark<0 || mark >10){
            throw new RuntimeException();
        }

        String result = VERY_BAD_MARK;

        switch(mark){
            case 2:
            case 3: result = UNSATISFACTORY_MARK; break;
            case 4: result = SATISFACTORY_MARK; break;
            case 5:
            case 6: result = NOT_BAD_MARK; break;
            case 7:
            case 8: result = NICE_MARK; break;
            case 9: result = Great_MARK; break;
            case 10: result = AWESOME_MARK; break;
        }

        return result;
    }
}
