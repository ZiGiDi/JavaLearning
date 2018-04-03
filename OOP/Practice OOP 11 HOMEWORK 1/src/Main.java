
public class Main {

    public static void main(String[] args) {
        // write your code here
        Thread[] threadArray = new Thread[20];

        for (int i = 0; i < threadArray.length; i++){
            threadArray[i] = new Thread(new FactorialThread(i));
        }


        for(Thread thread: threadArray){
           thread.start();
//           try{
//               thread.join();
//           } catch(InterruptedException e){
//               e.getStackTrace();
//           }
       }

        System.out.println(Thread.currentThread().getName() + " is stoped");
    }
}

