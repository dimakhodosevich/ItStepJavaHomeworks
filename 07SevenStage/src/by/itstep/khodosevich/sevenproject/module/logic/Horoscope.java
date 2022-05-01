package by.itstep.khodosevich.sevenproject.module.logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Horoscope {


    public static String checkHoroscope(int day, int month, int year) {

        month--; // add because argument month >0, calendar starts from 0;

        Calendar calender = new GregorianCalendar(day, month, year);

        if (calender.getActualMinimum(Calendar.DAY_OF_MONTH) > day
                || calender.getActualMinimum(Calendar.MONTH) > month
                || calender.getActualMaximum(Calendar.DAY_OF_MONTH) < day
                || calender.getActualMaximum(Calendar.MONTH) < month) {
            throw new RuntimeException();
        }

        month++; // add because my logic starts from 1, calendar starts from 0;

        String zodiac = "not correct";

        switch (month) {

            case 1: {
                if (day <= 20) {
                    zodiac = "Capricorn";
                    break;
                } else {
                    zodiac = "Aquarius";
                    break;
                }
            }
            case 2: {
                if (day <= 19) {
                    zodiac = "Aquarius";
                    break;
                } else {
                    zodiac = "Pisces";
                    break;
                }
            }
            case 3: {
                if (day <= 20) {
                    zodiac = "Pisces";
                    break;
                } else {
                    zodiac = "Aries";
                    break;
                }
            }
            case 4: {
                if (day <= 20) {
                    zodiac = "Aries";
                    break;
                } else {
                    zodiac = "Taurus";
                    break;
                }
            }
            case 5: {
                if (day <= 21) {
                    zodiac = "Taurus";
                    break;
                } else {
                    zodiac = "Gemini";
                    break;
                }
            }
            case 6: {
                if (day <= 21) {
                    zodiac = "Gemini";
                    break;
                } else {
                    zodiac = "Cancer";
                    break;
                }
            }
            case 7: {
                if (day <= 22) {
                    zodiac = "Cancer";
                    break;
                } else {
                    zodiac = "Leo";
                    break;
                }
            }
            case 8: {
                if (day <= 21) {
                    zodiac = "Leo";
                    break;
                } else {
                    zodiac = "Virgo";
                    break;
                }
            }
            case 9: {
                if (day <= 23) {
                    zodiac = "Virgo";
                    break;
                } else {
                    zodiac = "Libra";
                    break;
                }
            }
            case 10: {
                if (day <= 23) {
                    zodiac = "Libra";
                    break;
                } else {
                    zodiac = "Scorpio";
                    break;
                }
            }
            case 11: {
                if (day <= 22) {
                    zodiac = "Scorpio";
                    break;
                } else {
                    zodiac = "Sagittarius";
                    break;
                }
            }
            case 12: {
                if (day <= 22) {
                    zodiac = "Sagittarius";
                    break;
                } else {
                    zodiac = "Capricorn";
                    break;
                }
            }

        }

        return zodiac;
    }
}
