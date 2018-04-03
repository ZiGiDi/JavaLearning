import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File folder = new File("." );
        Thread thr = new Thread(new FileWatcher(folder));
        thr.start();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        thr.interrupt();
    }
}
