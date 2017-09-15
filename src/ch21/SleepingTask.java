package ch21;

import java.util.concurrent.*;

/**
 * Created by wuyan on 2017/9/15.
 */
public class SleepingTask extends LiftOff{
    public void run(){
        while (countDown-- > 0){
            System.out.print(status());
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
