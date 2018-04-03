public class Main {

    public static void main(String[] args) {
        Action ac = new Action();

        PushPullThread push = new PushPullThread("Push", ac, true);
        PushPullThread pull = new PushPullThread("Pull", ac, false);

        Thread pushThread = new Thread(push);
        Thread pullThread = new Thread(pull);

        pushThread.start();
        pullThread.start();


	// write your code here
    }
}
