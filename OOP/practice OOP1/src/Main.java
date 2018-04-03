public class Main {

    public static void main(String[] args) {
	// write your code here
        Car carOne = new Car();
        carOne.setColor( "Green");
        carOne.setWeight(1500);
        carOne.setYear(1990);
        System.out.println(carOne);

        Car carThree = new Car("Red",3000,2001);
        System.out.println(carThree);


    }
}
