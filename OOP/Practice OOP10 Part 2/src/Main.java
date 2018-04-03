import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        File in = new File("C:\\Users\\ZiGiDi\\Desktop\\English\\titles\\trofimov.pdf");
//        File out = new File ("book.pdf");
//        File in2 = new File("C:\\Users\\ZiGiDi\\Desktop\\English\\titles");
//
//        try {
//            FileOperation.fileCopy(in, out);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
//       FileOperation.getDirSize(in2);
//
//       System.out.println(FileOperation.calculateFolderSize(in2));


        try(DataOutputStream f = new DataOutputStream( new FileOutputStream("b.txt"))){
            f.writeInt(17);
        } catch (IOException e){
            System.out.println("File write Error");
        }





	// write your code here
    }
}
