import java.util.Scanner;

public class PigLatin{
    public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);
    String phrase = scan.nextLine();
    System.out.print("Phrase: ");
    int len = phrase.length();
    String firstLetter = phrase.substring(0,1);
    if (firstLetter == "a" || firstLetter == "e" || firstLetter == "o" || firstLetter == "u" || firstLetter == "i"){
    phrase = phrase.substring(1);
    phrase = phrase + firstLetter;

    }
    else{
        phrase = phrase.substring(1);
        phrase = phrase + firstLetter + "ay";

    }
}