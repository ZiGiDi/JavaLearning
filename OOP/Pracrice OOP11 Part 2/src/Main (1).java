public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread thr = new Thread(new KillerThread());
        thr.start();

    }
}
