import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> number = new HashMap<>();

        number.put(1,"one");
        number.put(2,"two");
        number.put(3,"three");
        number.put(4,"four");
        number.put(10,"ten");

        System.out.println(number);

        String value = number.get(10);
        System.out.println(value);

        number.put(5,"five");
        System.out.println(number);

        String delete = number.remove(3);
        System.out.println(number);
        System.out.println(delete);

        Set<Integer> setNumber = number.keySet();

        for (Integer key: setNumber) {
            System.out.println(key + " -> " + number.get(key));
        }

    }
}
