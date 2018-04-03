import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] array = generateArray(100000000);
        Map<Integer,Integer> numbers = count(array);
        Set<Integer> keys = numbers.keySet();
        for(Integer key: keys){
            System.out.println(key + " -> " + numbers.get(key) + "  \t "+ numbers.get(key)*100.0/array.length + "%");
        }
        System.out.println();
        //System.out.println(Arrays.toString(array));




            }

    public static  int [] generateArray(int n){
        int[] array = new int[n];
        Random rn = new Random();
        for (int i =0; i < array.length; i++){
            array[i] = rn.nextInt(10);
        }
        return array;
    }

    public static Map<Integer, Integer> count(int[] array){
        Map<Integer, Integer> number = new HashMap<>();


//        for (int i =0; i<array.lenght; i++){
//            int count = 0;
//            for(int numbers: array){
//                if( i == numbers){
//                    count++;
//                }
//                number.put(i,count);
//            }
//
//        }

        for(int numbers: array) {
         Integer numb = number.get(numbers);
            if(numb != null){
                number.put(numbers, numb+1);
            }
            else {
                number.put(numbers,1);
            }
      }




        return  number;
    }
}
