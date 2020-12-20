package soru7;

public class ThreadSleeper {
	
	public static void sleep(long sleepTime){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}

