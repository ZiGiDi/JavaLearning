public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread thOne = new Thread(new FactorialThread(20));
        Thread thTwo = new Thread(new FactorialThread(20));
        Thread thThree = new Thread(new FactorialThread(20));

       // thOne.setPriority(9);

        thOne.setDaemon(true);
        thTwo.setDaemon(true);
        thThree.setDaemon(true);

        thOne.start();
        thTwo.start();
        thThree.start();

//        try{
//           thOne.join();
//            thTwo.join();
//            thThree.join();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println(Thread.currentThread().getName() + " is stoped");
    }
}
