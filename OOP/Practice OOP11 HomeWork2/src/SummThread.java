import java.util.concurrent.atomic.AtomicInteger;

public class SummThread implements Runnable {
    int[] arr;
    int start;
    int stop;
    private AtomicInteger result;


    public SummThread(int[] arr, int start, int stop, AtomicInteger result) {
        this.arr = arr;
        this.start = start;
        this.stop = stop;
        this.result = result;
    }

    private void sum(){

        int sum = 0;

        for (int i = start; i < stop; i++){
            sum+=arr[i];
        }
        result.getAndAdd(sum);
    }


    @Override
    public void run() {
        sum();
    }
}
