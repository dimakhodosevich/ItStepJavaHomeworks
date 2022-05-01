package by.itstep.khodosevich.sixproject.module.logic;

public class Palindrome {
    public static boolean checkPalindrome(long var1){

        long palindrome = var1;

        long last_number = palindrome%10;
        palindrome/=10;

        while(palindrome!=0){

            long previous_number = palindrome%10;
            palindrome/=10;
            last_number = last_number*10+previous_number;

        }

        if(last_number==var1 && var1/10!=0){
            return true;
        }

        return false;
    }
}
