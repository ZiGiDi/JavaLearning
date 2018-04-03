import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 3, 6);
        Cat cat2 = new Cat("Umka", 1, 3);
        Cat cat3 = new Cat("Kuzya", 5, 5);
        Cat cat4 = new Cat("Markiz", 2, 7);
        Cat cat5 = new Cat("Dymok", 4, 4);

        Cat [] catArray = new Cat[]{cat1, cat2, cat3, cat4, cat5};

        for(Cat cat: catArray){
            System.out.println(cat);
        }
        System.out.println();

        Arrays.sort(catArray, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1.getAge()>o2.getAge()) {
                    return 1;
                }
                if(o1.getAge()<o2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });


        for(Cat cat: catArray){
            System.out.println(cat);
        }
        System.out.println();

        Arrays.sort(catArray, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1.getMass()>o2.getMass()) {
                    return 1;
                }
                if(o1.getMass()<o2.getMass()) {
                    return -1;
                }
                return 0;
            }
        });


        for(Cat cat: catArray){
            System.out.println(cat);
        }

        System.out.println();
        Arrays.sort(catArray, (a,b) -> a.getName().compareTo(b.getName()));
        for(Cat cat: catArray){
            System.out.println(cat);
        }




    }
	// write your code here
//        ByteSequence bs = new ByteSequence();
//        bs.addStringToSequence("Hello ");
//        bs.addStringToSequence("World");
//        System.out.println(bs.getString());
//
//        ByteSequence bsOne = new ByteSequence() {
//
//            public String anotherTexr = "Hello";
//
//            public void addIntToByteSequince(int n){
//                String number = Integer.toString(n);
//                super.addStringToSequence(number);
//            }
//
//            @Override
//            public String getString(){
//                this.addIntToByteSequince(123456);
//                this.addStringToSequence(anotherTexr);
//                return super.getString();
//            }
////            @Override
////            public String getString(){
////                return super.getString().substring(0,super.getString().length()/2);
////            }
//
//        };
//
//        bsOne.addStringToSequence("Hello ");
//        bsOne.addStringToSequence("World");
//
//        System.out.println(bsOne.getString());
//
//        System.out.println(bs.getClass());
//        System.out.println(bsOne.getClass());
//        System.out.println(bsOne instanceof ByteSequence);
//
//    }
}
