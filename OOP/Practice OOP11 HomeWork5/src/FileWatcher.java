/**
 * Created by ZiGiDi on 21.01.2018.
 */
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FileWatcher implements Runnable{
    private File mainFolder;

    public FileWatcher(File mainFolder) {
        this.mainFolder = mainFolder;
    }

    public FileWatcher() {
    }

    ArrayList<String> listOfFiles = new ArrayList<String>();
    ArrayList<String> listOfFilesOld = new ArrayList<String>();

    public File getMainFolder() {
        return mainFolder;
    }

    private String getFolderInt(){

        if (mainFolder.isDirectory()) {
            String[] filenames = mainFolder.list();
            for (String file : filenames) {
                this.listOfFiles.add(file);
            }
        } else System.out.format("Error! The directory '%s' isn't exists", mainFolder);


        if (mainFolder ==null){
            return "None";
        }

        for ( String file: this.listOfFiles)
        {
            if (!this.listOfFilesOld.contains(file)){
                System.out.println("File " + file.toString()+"was created");
        }
        }


        for ( String file: this.listOfFilesOld)
        {
            if (!this.listOfFiles.contains(file)){
                System.out.println("File " + file.toString()+"was delete");
            }
        }

        System.out.println();


        StringBuilder sb = new StringBuilder();
        File[] fileArray = this.mainFolder.listFiles();
        for (File file: fileArray){
           // sb.append(file.getName() +"\t" + file.length()).append(System.lineSeparator());
        }

        this.listOfFilesOld = this.listOfFiles;

        return " ";
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyy   hh:mm:ss");
        for(;!thr.isInterrupted();){
            System.out.println(sdf.format(System.currentTimeMillis()));
            System.out.println(getFolderInt());
            System.out.println();
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e) {
                break;
            }
        }
        System.out.println("File Watcher is stop!!");

    }
}
