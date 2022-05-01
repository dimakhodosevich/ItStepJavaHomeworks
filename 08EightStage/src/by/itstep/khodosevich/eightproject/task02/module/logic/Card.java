package by.itstep.khodosevich.eightproject.task02.module.logic;

public class Card {



    public static final String SPADES_CARD_SUIT = "Spades";
    public static final String CLUBS_CARD_SUIT = "Clubs";
    public static final String DIAMONDS_CARD_SUIT = "Diamond";
    public static final String HEARTS_CARD_SUIT = "Heart";

    public static final String SIX_CARD_NAME = "Six";
    public static final String SEVEN_CARD_NAME = "Seven";
    public static final String EIGHT_CARD_NAME = "Eight";
    public static final String NINE_CARD_NAME = "Nine";
    public static final String TEN_CARD_NAME = "Ten";
    public static final String JACK_CARD_NAME = "Jack";
    public static final String QUEEN_CARD_NAME = "Queen";
    public static final String KING_CARD_NAME = "King";
    public static final String ACE_CARD_NAME = "Ace";

    public static String getCardSuit(int cardSuit){

        if(cardSuit<1 || cardSuit>4){
            throw new RuntimeException();
        }

        String result = SPADES_CARD_SUIT;

        switch (cardSuit){
            case 2: result = CLUBS_CARD_SUIT; break;
            case 3: result = DIAMONDS_CARD_SUIT; break;
            case 4: result = HEARTS_CARD_SUIT; break;
        }

        return result;
    }

    public static String getCardName(int cardName){

        if(cardName<6 || cardName>14){
            throw new RuntimeException();
        }

        String result = SIX_CARD_NAME;

        switch (cardName){
            case 7: result = SEVEN_CARD_NAME; break;
            case 8: result = EIGHT_CARD_NAME; break;
            case 9: result = NINE_CARD_NAME; break;
            case 10: result = TEN_CARD_NAME; break;
            case 11: result = JACK_CARD_NAME; break;
            case 12: result = QUEEN_CARD_NAME; break;
            case 13: result = KING_CARD_NAME; break;
            case 14: result = ACE_CARD_NAME; break;
        }

        return result;
    }

}
