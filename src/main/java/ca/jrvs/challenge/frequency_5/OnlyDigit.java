package ca.jrvs.challenge.frequency_5;

public class OnlyDigit {

    //Check if a String contains only digits
    public boolean isOnlyDigit(String text){
        if (text.matches("[0-9]+")){
            return true;
        }
        return false;
    }
}
