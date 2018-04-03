
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 2, "white");
        Cat cat2 = new Cat("Murkaska", 10, "black");
        Cat cat3 = new Cat("Elka", 5, "mixed");
        Cat cat4 = new Cat("Tunks", 6, "grey");
        Cat cat5 = new Cat("Barsic", 14, "red");


        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        printList(catList);


        ArrayList<Cat> catByAge = catList.stream()
                .filter(n ->n.getAge()>5)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println();
        printList(catByAge);



        ArrayList<String> catString = catList.stream()
                .filter(n ->n.getAge()>5)
                .map(n -> n.getName())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println();
        printList(catString);



        ArrayList<String> catSort = catList.stream()
                .filter(n ->n.getAge()>5)
                .map(n -> n.getName())
                .sorted((a,b) -> b.length() - a.length())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println();
        printList(catSort);
    }



    public static void  printList(List<?> list){

        for(Object object: list){
            System.out.println(object);
        }
    }

}
