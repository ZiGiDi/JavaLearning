import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SomeClass<Integer> sc = new SomeClass<>(1234);

        sc.setObj(1234568);

//        System.out.println(sc);
//
//        SomeClass<String> scString = new SomeClass<>("Hello World");
//
//        scString.setObj("Good by WORLD");
//
//        System.out.println(scString);
//
//        SomeClass scThree = new SomeClass( new File("a.txt""));
    SomeClass<BigInteger> scBI = new SomeClass<BigInteger>(new BigInteger("123456"));

        System.out.println(scBI);

        Integer[] arrayOne = new Integer[]{4,2,7,9,5,48};
        int min = findMin(arrayOne);
        System.out.println(min);

        String[] arrayTwo = new String[]{"Hello", "World","A", "B", "AA", "AC"};
        String minString = findMin(arrayTwo);
        System.out.println(minString);

        //Scanner[] scArray = new Scanner[]{new Scanner(System.in), new Scanner(System.in)};
        //findMin(scArray); сканер не сравниваемая между собой вещь

    }

    public  static  <T extends  Comparable<T>> T findMin(T[] array){
        T min = array[0];

        for (T element: array){
            if(min.compareTo(element)>0){
                min = element;
            }
        }
        return min;


    }


}
