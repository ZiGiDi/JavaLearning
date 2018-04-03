
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File fileTwo = new File("a.txt");

        try{
            fileTwo.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        File folder = new File("A");
        folder.mkdirs();

        File fileThree = new File(folder,"b.txt");
        try{
            fileThree.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }

        fileThree.delete();
        folder.delete();



        File file = new File(".");
        File [] fileArray = file.listFiles();
        for(File fileOne: fileArray){
            long fileSize = fileOne.length();
            String type=(fileOne.isFile())?"File":"Folder";
            System.out.println(fileOne.getName() + "\t" + type + "\t" + fileSize);
        }

    }
}
