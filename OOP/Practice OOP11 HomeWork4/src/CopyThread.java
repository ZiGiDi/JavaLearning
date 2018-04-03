import java.io.File;
import  java.io.FileInputStream;
import  java.io.FileOutputStream;
import java.io.IOException;

public class CopyThread implements Runnable {

    private File source;
    private File dest;

    public CopyThread(File source, File dest) {
        this.source = source;
        this.dest = dest;
    }

    public File getSoure() {
        return source;
    }

    public void setSoure(File soure) {
        this.source = soure;
    }

    public File getDest() {
        return dest;
    }

    public void setDest(File dest) {
        this.dest = dest;
    }


    public static void copy(File source, File dest) throws IOException {
        FileInputStream is = new FileInputStream(source);
        try {
            FileOutputStream os = new FileOutputStream(dest);
            try {
                byte[] buffer = new byte[4096];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } finally {
                os.close();
            }
        } finally {
            is.close();
        }
    }

    @Override
    public void run() {
        try {
            copy(source, dest);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
