import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        Rectangle rectOne = new Rectangle(3,4);
        Rectangle rectTwo = new Rectangle(3,4);

        System.out.println(rectOne);

        System.out.println("Hash Cod 1 => "+rectOne.hashCode());
        System.out.println("Hash Cod 2 => "+rectTwo.hashCode());

//        for (int i=0; i<10;i++){
//            new Rectangle(2,2);
//        }
//        System.gc();// принудительный запуск уборщика мусора
//        System.out.println("main method stop");

        if(rectOne==rectTwo){
            System.out.println("RectOne == RectTwo");
        } else{
            System.out.println("RectOne != RectTwo");
        }

        if(rectOne.equals(rectTwo)){
            System.out.println("RectOne equal RectTwo");
        } else{
            System.out.println("RectOne NOT equal RectTwo");
        }

        Rectangle rectThree = null;

        try {
            rectThree = rectOne.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        if(rectThree==rectTwo){
            System.out.println("RectThree == RectTwo");
        } else{
            System.out.println("RectThree != RectTwo");
        }

        if(rectThree.equals(rectTwo)){
            System.out.println("RectThree equal RectTwo");
        } else{
            System.out.println("RectThree NOT equal RectTwo");
        }

        System.out.println();

        //Class classRectangule = Rectangle.class;
        Class classRectangule = rectOne.getClass();
        Field[] fileArray=classRectangule.getDeclaredFields();
        for (Field file: fileArray){
            System.out.println(file);
        }

        System.out.println();

        Method[] fileArray2=classRectangule.getDeclaredMethods();
        for (Method file: fileArray2){
            System.out.println(file);
        }
        System.out.println();

        Constructor <?>[] fileArray3=classRectangule.getConstructors();
        for (Constructor file: fileArray3){
            System.out.println(file);
        }
        System.out.println();
        System.out.println(rectThree);

        try{
            Field w = classRectangule.getDeclaredField("with");
            w.setAccessible(true);
            w.setDouble(rectThree, 10);
        } catch (NoSuchFieldException| IllegalAccessException e){
            e.printStackTrace();
        }

        System.out.println(rectThree);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"))) {
            oos.writeObject(rectOne);
        }catch (IOException e){
            e.printStackTrace();
        }

        Rectangle rectFive = null;
        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream("a.txt")))){
            rectFive = (Rectangle) ois.readObject();
        }catch (IOException| ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("rectFive "+rectFive);



    }
}
