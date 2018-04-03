import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String > mapOne = new HashMap<>();
        mapOne.put(1,"one");
        mapOne.put(5,"five");
        mapOne.put(2, "two");
        mapOne.put(4,"four");
        mapOne.put(3,"three");

        String text = mapOne.getOrDefault(10, "unknown");
        System.out.println(text);

        mapOne.forEach((key, value) -> System.out.println(key + "  "+value));
        System.out.println();

        mapOne.replaceAll((key, value) -> value.toUpperCase() );
        mapOne.forEach((key, value) -> System.out.println(key + "  "+value));
        System.out.println();

        mapOne.putIfAbsent(3, "new three");
        mapOne.putIfAbsent(7,"Seven");
        mapOne.forEach((key, value) -> System.out.println(key + "  "+value));
        System.out.println();

        mapOne.remove(1, "one");
        mapOne.remove(4,"FOUR");
        mapOne.forEach((key, value) -> System.out.println(key + "  "+value));
        System.out.println();

        mapOne.computeIfAbsent(3, key -> ("number " + key));
        mapOne.computeIfAbsent(9, key -> ("number " + key));
        mapOne.forEach((key, value) -> System.out.println(key + "  "+value));
        System.out.println();


        mapOne.computeIfPresent(6,(key,value) -> " "+key +" " + value );
        mapOne.computeIfPresent(2,(key,value) -> " "+key +" " + value );
        mapOne.forEach((key, value) -> System.out.println(key + "  "+value));
        System.out.println();

        mapOne.merge(6, "Six", (key, value) -> "number " + value);
        mapOne.merge(3, "Three", (key, value) -> "number " + value);
        mapOne.forEach((key, value) -> System.out.println(key + "  "+value));
        System.out.println();



    }
}
