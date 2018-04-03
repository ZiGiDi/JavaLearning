import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ZiGiDi on 23.02.2018.
 */
public class Dictionary {

    HashMap<String, String>  dict = new HashMap<>();




    public Dictionary(HashMap<String, String> dict) {
        this.dict = dict;
    }

    public Dictionary() {
    }

    public HashMap<String, String> getDict() {
        return dict;
    }

    public void setDict(HashMap<String, String> dict) {
        this.dict = dict;
    }


    public void addWord(Scanner in){
        String en, ru;

        System.out.println("Input ENGLISH word");
        en = in.nextLine();

        System.out.println("Input translate");
        ru = in.nextLine();

        dict.put(en,ru);
    }

    public void addWord(String en, String ru){
        dict.put(en,ru);
    }



    public void translate(String str) {

        for (String s : str.split(" ")) {
            System.out.print(dict.get(s) + " ");
        }
        System.out.println();
    }


}
