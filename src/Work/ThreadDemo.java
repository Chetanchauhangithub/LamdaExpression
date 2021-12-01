package Work;

public class ThreadDemo {

    public static void main(String[] args) {

            Runnable thread1 = ()->{

                for(int i=0;i<10;i++){

                    System.out.println("Value of i = "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

            Thread t1 = new Thread(thread1);
            t1.setName("FirstThread");
            t1.start();

            Runnable thread2 = ()->{

                for(int i=10;i<20;i++){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };

            Thread t2 = new Thread(thread2);
            t2.start();
    }
}
