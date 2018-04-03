import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();

        list.add(4);
        list.add(10);
        list.add(-2);


        System.out.println(list);

        list.set(2,5);
        System.out.println(list);

        int position = list.indexOf(10);
        System.out.println(position);

        list.add(2, 18);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        Iterator<Integer> itr = list.iterator();
        for(;itr.hasNext();){
            System.out.println(itr.next());
        }

        for (Integer integer: list){
          System.out.println(integer);
        }


    }
}
