package by.itstep.khodosevich.nineproject.task01.module;

import java.util.Random;

public class SimplePoker {

    public static final int TABLE_CARD = 5;
    public static final int PLAYER_CARD = 2;

    public static final int MIN_PLAYER_NUMBER = 2;
    public static final int MAX_PLAYER_NUMBER = 10;

    public static final int MIN_CARD_NUMBER = 2;
    public static final int MAX_CARD_NUMBER = 14;

    public static final int MIN_CARD_SUIT_NUMBER = 1;
    public static final int MAX_CARD_SUIT_NUMBER = 4;

    public static final String TWO_CARD = "двойка";
    public static final String TREE_CARD = "тройка";
    public static final String FOUR_CARD = "четверка";
    public static final String FIVE_CARD = "пятерка";
    public static final String SIX_CARD = "шестерка";
    public static final String SEVEN_CARD = "семерка";
    public static final String EIGHT_CARD = "восьмерка";
    public static final String NINE_CARD = "девятка";
    public static final String TEN_CARD = "десятка";
    public static final String JACK_CARD = "валет";
    public static final String QUEEN_CARD = "дама";
    public static final String KING_CARD = "король";
    public static final String ACE_CARD = "туз";

    public static final String HEART_CARD_SUIT = "чирва";
    public static final String SPADE_CARD_SUIT = "пика";
    public static final String DIAMOND_CARD_SUIT = "бубна";
    public static final String CLUB_CARD_SUIT = "крестен";

    public static String playCard(int player) {
        if (player < MIN_PLAYER_NUMBER || player > MAX_PLAYER_NUMBER) {
            throw new RuntimeException();
        }

        String[] cardNumbers = new String[player * PLAYER_CARD + TABLE_CARD];
        String[] cardSuits = new String[player * PLAYER_CARD + TABLE_CARD];
        Random random = new Random();

        int numberOfCard = 0;

        while (numberOfCard != player * PLAYER_CARD + TABLE_CARD) {

            boolean cardAlreadyThere = false;
            String cardNumber = getCardNumber(random.nextInt(MAX_CARD_NUMBER - MIN_CARD_NUMBER + 1) + MIN_CARD_NUMBER);
            String cardSuit = getCardSuit(random.nextInt(MAX_CARD_SUIT_NUMBER - MIN_CARD_SUIT_NUMBER + 1)
                    + MIN_CARD_SUIT_NUMBER);

            for (int i = 0; i < cardNumbers.length; i++) {

                if (cardNumber == cardNumbers[i] && cardSuit == cardSuits[i]) {
                    cardAlreadyThere = true;
                }
            }
            if (!cardAlreadyThere) {
                cardNumbers[numberOfCard] = cardNumber;
                cardSuits[numberOfCard] = cardSuit;
                numberOfCard++;
            }
        }

        String msg = ShowCard(cardNumbers, cardSuits);
        return msg;
    }

    private static String getCardNumber(int cardNumber) {
        if (cardNumber < MIN_CARD_NUMBER || cardNumber > MAX_CARD_NUMBER) {
            throw new RuntimeException();
        }

        String cardStringNumber = ACE_CARD;

        switch (cardNumber) {
            case 2:
                cardStringNumber = TWO_CARD;
                break;
            case 3:
                cardStringNumber = TREE_CARD;
                break;
            case 4:
                cardStringNumber = FOUR_CARD;
                break;
            case 5:
                cardStringNumber = FIVE_CARD;
                break;
            case 6:
                cardStringNumber = SIX_CARD;
                break;
            case 7:
                cardStringNumber = SEVEN_CARD;
                break;
            case 8:
                cardStringNumber = EIGHT_CARD;
                break;
            case 9:
                cardStringNumber = NINE_CARD;
                break;
            case 10:
                cardStringNumber = TEN_CARD;
                break;
            case 11:
                cardStringNumber = JACK_CARD;
                break;
            case 12:
                cardStringNumber = QUEEN_CARD;
                break;
            case 13:
                cardStringNumber = KING_CARD;
                break;
        }
        return cardStringNumber;
    }

    private static String getCardSuit(int numberSuit) {
        if (numberSuit < MIN_CARD_SUIT_NUMBER || numberSuit > MAX_CARD_SUIT_NUMBER) {
            throw new RuntimeException();
        }

        String cardStringSuit = CLUB_CARD_SUIT;

        switch (numberSuit) {
            case 2:
                cardStringSuit = HEART_CARD_SUIT;
                break;
            case 3:
                cardStringSuit = SPADE_CARD_SUIT;
                break;
            case 4:
                cardStringSuit = DIAMOND_CARD_SUIT;
                break;
        }
        return cardStringSuit;
    }

    private static String ShowCard(String[] cardNumbers, String[] cardSuits) {
        String result = "";

        for (int i = 0, numberOfPrayer = 1; i < cardNumbers.length; i++) {

            if (i == 0) {
                result += String.format("Карты на столе:\n");
            } else if (i == TABLE_CARD) {
                result += String.format("\n");
            }

            if (i >= TABLE_CARD && (i - TABLE_CARD) % PLAYER_CARD == 0) {
                result += String.format("Карты игрока №%d:\n", numberOfPrayer++);
            }

            result += String.format("Карта: %s %s\n",
                    cardNumbers[i], cardSuits[i]);

            if (i >= TABLE_CARD && (i - TABLE_CARD) % PLAYER_CARD == 0) {
                result += String.format("");
            }
        }

        return result;
    }
}
