package by.itstep.khodosevich.sevenproject.module.logic;

public class VowelAndConsonant {
    public static boolean checkLetter(char letter) {

        Character alphabet = Character.toLowerCase(letter);

        boolean result = false;

        switch (alphabet) {
            case 'a':
                ;
            case 'e':
                ;
            case 'o':
                ;
            case 'i':
                ;
            case 'u':
                ;
            case 'y':
                result = true;
                break;
        }

        return result;
    }
}
