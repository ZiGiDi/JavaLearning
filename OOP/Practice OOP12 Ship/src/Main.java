
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Ship sh1 = new Ship("bistriy", 20);
        Ship sh2 = new Ship("grozniy", 10);
        Ship sh3 = new Ship("titanik", 10);

        DocStation port1 = new DocStation(false, "1");
        DocStation port2 = new DocStation(false,"2");

        DocStation[] docs = {port1,port2};

        UnloadThread th1 = new UnloadThread(sh1,docs);
        UnloadThread th2 = new UnloadThread(sh2,docs);
        UnloadThread th3 = new UnloadThread(sh3,docs);

        ExecutorService dock = Executors.newFixedThreadPool(2);
        dock.execute(th1);
        dock.execute(th2);
        dock.execute(th3);
        dock.shutdown();



	// write your code here
    }
}
