package by.itstep.khodosevich.eightproject.task04.module;

public class Letter {
    public static String checkSymbol(char ch){

        String result = "Not letter.";
        result = checkLetterVowel(ch)?"Your letter is vowel.":result;
        result = checkLetterConsonant(ch)?"Your letter is consonant.":result;

        return result;
    }

    private static boolean checkLetterVowel(char ch){
        char[] lettersVowel = {'a','o','i','e','y','u',};

        Character temp = Character.toLowerCase(ch);
        ch = temp;

        for(char element: lettersVowel){
            if(ch==element){
                return true;
            }
        }
        return false;
    }

    private static boolean checkLetterConsonant(char ch){
        char[] lettersConsonant = {'q','w','r','t','p','s','d','f','g',
                'h','j','k','l','z','x','c','v','b','n','m'};

        Character temp = Character.toLowerCase(ch);
        ch = temp;

        for(char element: lettersConsonant){
            if(ch==element){
                return true;
            }
        }
        return false;
    }

}
