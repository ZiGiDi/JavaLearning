import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int[] myArr = new int[200000000];
        final int THREADS = 6;
        AtomicInteger result = new AtomicInteger(0);
        Thread[] threads = new Thread[THREADS];
        int begin =0;


        Random rnd = new Random();

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (rnd.nextInt(10) + 1);
        }

        int dlenght = myArr.length/THREADS;


        long rTime = System.currentTimeMillis();
        int finish = dlenght;
        for(int i =0; i<THREADS; i++) {
            if(i == THREADS-1) {
                finish = myArr.length;
            }
            threads[i] = new Thread(new SummThread(myArr, begin, finish, result));
            threads[i].start();
            begin=begin+dlenght;
            finish = finish+dlenght;
        }

        for(Thread thread: threads){
            try{
                thread.join();
            } catch(InterruptedException e){
                e.getStackTrace();
            }
        }






        rTime = System.currentTimeMillis() - rTime;

        String formatStr = "sum: %d\t%2dms\t%5d threads\n";
        System.out.printf(formatStr, result.get(), rTime, THREADS);

        rTime = System.currentTimeMillis();

        int sum = 0;

        for (int i = 0; i < myArr.length; i++){
            sum+=myArr[i];
        }

        rTime = System.currentTimeMillis() - rTime;

        String formatStr2 = "sum: %d\t%2dms\t%5d threads\n";
        System.out.printf(formatStr2,sum, rTime, THREADS);

    }


    }

