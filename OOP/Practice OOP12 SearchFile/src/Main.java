import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        File area = new File("C:/Users/zigid/OneDrive/Рабочий стол/Книга мама");
        String search = "1.txt";

        SearchThread st = new SearchThread(area,search);

       Thread c = new Thread(st);
       c.start();

    }
}
