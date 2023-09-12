import java.util.Scanner;

public class PigLatin{
    public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);
    String phrase = scan.nextLine();
    System.out.print("Phrase: ");
    int len = phrase.length();
    if (phrase[0] == "a" || phrase[0] == "e" || phrase[0] == "o" || phrase[0] == "u" || phrase[0] == "i"){
    phrase = phrase + "ay";
    System.out.print(phrase);
    }
    else {
        char firstLetter = phrase[0];
        phrase = phrase.substring(1, len);

    
    phrase = phrase + firstLetter + "ay";
    System.out.print(phrase);
    }

    //phrase.substring(i, i+1);//up to but not including i +1

    }
}