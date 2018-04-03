import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingThread implements Runnable{
    private BaseFile bs;
    private int buferSize;
    File fileOut;

    public CopyingThread(BaseFile bs, File fileOut, int bufersize) {
        this.bs = bs;
        this.fileOut = fileOut;
        this.buferSize=bufersize;
    }


    public void Copy(){
        try (FileOutputStream fos = new FileOutputStream(fileOut)) {

            while (bs.getData().length != 0) {
                   synchronized (bs) {
                       fos.write(bs.getData(), 0, buferSize);

                       bs.wait();
                   }


            }
        } catch (InterruptedException | IOException e) {
            e.getMessage();
        }
        System.out.print("Copying is done    — 100%\n");
        bs.setCopy(true);

    }

    @Override
    public void run() {
        Copy();

    }
}
