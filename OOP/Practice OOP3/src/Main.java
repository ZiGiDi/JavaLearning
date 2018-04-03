import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] array = {0,2,4,5,6};
        System.out.println(getElement(array,2));
        System.out.println(getElement(array,7));
        System.out.println(getCircleArea(5));

        Scanner sc = new Scanner(System.in);
        sc.nextInt();

	// write your code here
    }

    public static int getElement(int [] array, int index){
        int result = 0;
        try {
            result = array[index];
        } catch(ArrayIndexOutOfBoundsException e){
           // System.out.println("Invalid index");
            e.printStackTrace();
        }
        return result;

        }

        public static double getCircleArea(double r){
           if(r<0){
               throw new IllegalArgumentException("Negative radius");
           }
            return Math.PI*r*r;
        }
    }
