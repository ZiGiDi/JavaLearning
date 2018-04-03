import java.awt.*;
import java.io.File;

public class ProgressThread implements Runnable {
    private File in;
    private File out;
    private BaseFile bs;


    public ProgressThread(File in, File out, BaseFile bs) {
        super();
        this.in = in;
        this.out = out;
        this.bs = bs;

    }

    public void progress(){
        for(;bs.isCopy()==false;) {
            double progr = ((double) out.length() / (double) in.length()) * 100;

            System.out.println("Copy progress is " + progr + " %");

            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }


    @Override
    public void run() {
        progress();
    }
}
