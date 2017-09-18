package ch21;

import java.util.concurrent.TimeUnit;
import static net.mindview.util.Print.*;
/**
 * Created by wuyan on 2017/9/15.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MICROSECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                print("sleep() interrupted");
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
        }
    }
}
