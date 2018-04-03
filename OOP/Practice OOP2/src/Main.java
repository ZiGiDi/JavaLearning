public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat catOne = new Cat(5,6,true,"Milk","Vaska","Dvornyashka");
        catOne.getVoice();
        System.out.println(catOne);
        System.out.println(catOne.getAge());
        Animals an;
        an = catOne;
        an.getVoice();

        Animals[] animalArray = new Animals[10];

        animalArray[0] = catOne;

        System.out.println(animalArray[0]);

        Cat catTwo = null;
        if (animalArray[0].getClass() == Cat.class){
            catTwo = (Cat) animalArray[0];
        }
        System.out.println(catTwo.getType());


    }
}
