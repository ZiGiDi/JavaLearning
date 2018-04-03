import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

         ArrayList<String> listOfFiles = new ArrayList<String>();

        File[] arrayFile = new File("A").listFiles();
        File dest = new File("B");

        int c =0;

        File originals = new File("A");
        if (originals.isDirectory()) {
            String[] filenames = originals.list();
            for (String file : filenames) {
                listOfFiles.add(file);
            }
        } else System.out.format("Error! The directory '%s' isn't exists", originals);

        int fileCounter = listOfFiles.size();



        while (fileCounter >0){

            Thread[] threadArray = new Thread[6];

            for ( int i =0; i < 6; i++ ){
                try{
                    if (!listOfFiles.get(i+c).isEmpty()){
                        File in = new File("A/"+listOfFiles.get(i+c));
                        File out = new File("B/"+listOfFiles.get(i+c));

                threadArray [i] = new Thread(new CopyThread(in, out));
                threadArray[i].start();
                        System.out.println("File " + listOfFiles.get(i) + " was copied by " + threadArray[i].getName());
                fileCounter= fileCounter -1;}
                } catch (NullPointerException e){
                    e.printStackTrace();
                }
            }




            c = c+10;

        }

        System.out.println("Copy is completed");

	// write your code here
    }
}
