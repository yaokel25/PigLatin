import java.util.Scanner;

public class PigLatin{
    public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);
    System.out.print("Phrase: ");
    String phrase = scan.nextLine();
    int len = phrase.length();
    if (phrase[0] = a || phrase[0]){
    phrase = phrase + "ay";
    System.out.print(phrase);
    }
    else {
        char firstLetter = phrase[0];
    for(int i = 0; i < len; i++){
        char placeHolder = phrase[i+1];
        phrase[i] = placeHolder;
    }
    phrase = phrase + firstLetter + "ay";
    System.out.print(phrase);
    }

    //phrase.substring(i, i+1);//up to but not including i +1

    }
}