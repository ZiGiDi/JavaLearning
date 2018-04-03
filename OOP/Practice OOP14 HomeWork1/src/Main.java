import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student st1 = new Student(16, "Petya",2);
        Student st2 = new Student(19, "Kolya",3);
        Student st3 = new Student(23, "Vasya",1);

        Student[] studentArray = {st1, st2, st3};

        Group gr1 = new Group("FTF", studentArray);

        gr1.printGroup();
        gr1.saveData("a.txt", gr1);

        Group gr2 = gr1.restoreData("a.txt");


//        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream("a.txt")))){
//
//            System.out.println("All Data restore");
//            gr2 = (Group) ois.readObject();
//        }catch (IOException | ClassNotFoundException e){
//            e.printStackTrace();
//        }

        gr2.printGroup();

    }
}
