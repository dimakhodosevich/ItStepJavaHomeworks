package by.itstep.khodosevich.eightproject.task04;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.eightproject.task04.module.Letter.*;

public class TestLetter {

    @Test
    public void testCheckSymbolVowel(){
        char[] actual_values = {'a','o','i','e','y','u',};
        String expected = "Your letter is vowel.Your letter is vowel.Your letter is vowel." +
                "Your letter is vowel.Your letter is vowel.Your letter is vowel.";
        String actual = "";

        for(char element: actual_values){
            actual += checkSymbol(element);
        }

        assertEquals(expected, actual);
    }

    @Test
    public void testCheckSymbolConsonant(){
        char[] actual_values = {'q','w','r','t','p','s','d','f','g',
                'h','j','k','l','z','x','c','v','b','n','m'};
        StringBuilder expectedBuilder = new StringBuilder();
        for(char element:actual_values){
            expectedBuilder.append("Your letter is consonant.");
        }
        String expected = expectedBuilder+"";
        String actual = "";

        for(char element: actual_values){
            actual += checkSymbol(element);
        }

        assertEquals(expected, actual);
    }

    @Test
    public void testCheckSymbolNumber(){
        char actual_values = '8';
        String expected = "Not letter.";

        String actual = checkSymbol(actual_values);
        assertEquals(expected, actual);
    }


}
