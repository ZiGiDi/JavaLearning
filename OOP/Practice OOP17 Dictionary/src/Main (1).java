import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);


        Dictionary dictionary = new Dictionary();

        dictionary.addWord("I","Я");
        dictionary.addWord("love","люблю");
        dictionary.addWord("you","тебя");
        dictionary.addWord("baby","детка");
        dictionary.addWord("made","сделано");
        dictionary.addWord("in","в");
        dictionary.addWord("china","китае");

        String st = "I love you baby";
        dictionary.translate(st);

        dictionary.addWord(in);
        String st2 = "I love you my baby";
        dictionary.translate(st2);
    }
}
