import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.File;
public class SearchThread implements Runnable {
    private File file;
    private  String search;

    public SearchThread(File file, String search) {
        this.file = file;
        this.search = search;
    }



    public void  searching(File[] files) {
      //  System.out.println("Start");
        if (files == null) return;
        for (File i : files) {
            if (i.isFile() && i.getName().equalsIgnoreCase(search)) {
                System.out.format("%s has found %s\n", Thread.currentThread().getName(), i.getName());
                System.out.println("File Path: "+i.getAbsoluteFile());

            }
            if (i.isDirectory()) {
                //System.out.println("New Thread"+i.getAbsolutePath());
                Thread newThread = new Thread(new SearchThread(i, search));
                dock.execute(newThread);
                //newThread.start();
            }
        }
    }

    public void searchstart(){
        searching(file.listFiles());
    }

    ExecutorService dock = Executors.newFixedThreadPool(4);


    @Override
    public void run() {
        searchstart();
    }
}
