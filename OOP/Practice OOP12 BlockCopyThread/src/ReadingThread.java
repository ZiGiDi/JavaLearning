import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingThread implements Runnable {

    private BaseFile bs;
    private byte[] arr;
    File fileIn;

    public ReadingThread(BaseFile bs, File fileIn, int buffersize) {
        this.bs = bs;
        this.arr = new byte[buffersize];
        this.fileIn = fileIn;
    }

    public void fileRead(){

        bs.setFileLenght(fileIn.length());
        try (FileInputStream fis = new FileInputStream(fileIn)) {
            for (int n = 0; (n = fis.read(arr)) > 0; ) {
synchronized (bs) {
    bs.setData(arr);
    bs.wait();
}

            }
        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
        }
        bs.setData(new byte[0]);
    }

    @Override
    public void run() {
        fileRead();
    }
}

