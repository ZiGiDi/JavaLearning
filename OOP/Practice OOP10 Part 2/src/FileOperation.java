/**
 * Created by ZiGiDi on 14.01.2018.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

    public static void fileCopy(File in, File out) throws IOException {
        byte [] buffer =new byte[1024*1024];
        int readByte = 0;
        try(FileInputStream fis = new FileInputStream(in);
            FileOutputStream fos = new FileOutputStream(out)) {
            for(;(readByte=fis.read(buffer))>0;){
                fos.write(buffer,0,readByte);
            }

        }catch (IOException e){
            throw e;
            }
    }

    static long getDirSize(File dir){
        long size =0;
        if (dir.isFile()){
            size = dir.length();
        } else {
            File [] subFiles = dir.listFiles();
            for (File file: subFiles){
                if(file.isFile()){
                    size += file.length();
                } else{
                    size += getDirSize(file);
                }
            }
        }

        System.out.println("The size is " + size);
        return size;
    }


    public static long calculateFolderSize(File folder){
        if (folder.isFile()){
            return folder.length();
        }else{
            long size = 0;
            File[] fileArray = folder.listFiles();
            for(File file: fileArray){
                size +=calculateFolderSize(file);
            }
            return size;
        }

    }


}
