package by.itstep.khodosevich.eightproject.task02;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.eightproject.task02.module.logic.Card.*;

public class TestCard {

    @Test
    public void testGetCardSuitPositive(){

        int[] cardNumbers = {1,2,3,4};
        String expected =SPADES_CARD_SUIT+CLUBS_CARD_SUIT+DIAMONDS_CARD_SUIT+HEARTS_CARD_SUIT;
        String actual = "";

        for(int element: cardNumbers){
            actual +=String.format(getCardSuit(element));
        }

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCardSuitNegativeWithUpperNumber(){

        int cardNumber = 5;
        String actual = getCardSuit(cardNumber);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCardSuitNegativeWithLowerNumber(){

        int cardNumber = 0;
        String actual = getCardSuit(cardNumber);
    }

    @Test
    public void testGetCardNamePositive(){

        int[] cardNumbers = {6,7,8,9,10,11,12,13,14};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SIX_CARD_NAME).append(SEVEN_CARD_NAME).append(EIGHT_CARD_NAME).
                append(NINE_CARD_NAME).append(TEN_CARD_NAME).append(JACK_CARD_NAME).
                append(QUEEN_CARD_NAME).append(KING_CARD_NAME).append(ACE_CARD_NAME);
        String expected = stringBuilder+"";
        String actual = "";


        for(int element: cardNumbers){
            actual +=String.format(getCardName(element));
        }

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCardNameNegativeWithUpperNumber(){

        int cardNumber = 15;
        getCardName(cardNumber);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCardNameNegativeWithLowerNumber(){

        int cardNumber = 5;
        getCardName(cardNumber);
    }
}
