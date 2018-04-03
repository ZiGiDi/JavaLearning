import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	// write your code here
        Cat cat1 = new Cat("Vaska", 3);
        Cat cat2 = new Cat("Umka", 7);
        Cat cat3 = new Cat("Kuzya", 5);
        Cat cat4 = new Cat("Dymok", 1);
        Cat cat5 = new Cat("Rigik", 2);

   //     Cat[] catArray = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        Cat[] catArray = new Cat[]{cat1, null, cat2, null, cat3, cat4, cat5};

        for(Cat cat: catArray){
            System.out.println(cat);
        }

        System.out.println();

//        int parametr=0;
//        System.out.println("Input parametr");
//        parametr = sc.nextInt();
//        if(parametr==1) {
 //           Arrays.sort(catArray, (a, b) -> -1*(a.getAge() - b.getAge()));
//        }
//        if(parametr==2) {
//            Arrays.sort(catArray, (a, b) -> a.getName().compareTo(b.getName()));
//        }

        Arrays.sort(catArray, (a, b) -> CheckNull.checkNull(a,b)!=CheckNull.NOT_NULL?CheckNull.checkNull(a,b):
        a.getAge()-b.getAge());




        for(Cat cat: catArray){
            System.out.println(cat);
        }

        System.out.println();




    }
}
