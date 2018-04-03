import java.io.File;
public class Main {

    public static void main(String[] args) {
	// write your code here
        File in = new File("in.MOV");
        File out = new File("out.MOV");

        BaseFile bs = new BaseFile();
        ReadingThread rd = new ReadingThread(bs,in, 300);
        CopyingThread ct = new CopyingThread(bs,out,300);
        ProgressThread pt = new ProgressThread(in, out, bs);

        Thread th1 = new Thread(rd);
        Thread th2 = new Thread(ct);
        Thread th3 = new Thread(pt);

        th1.start();
        th2.start();
        th3.start();


    }
}
