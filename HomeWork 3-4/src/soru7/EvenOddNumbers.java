package soru7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EvenOddNumbers implements Runnable{
	
	private volatile List<Integer> numbers;
    static ArrayList<Integer> oddNumbers = new ArrayList<>();
    static ArrayList<Integer> evenNumbers = new ArrayList<>();

    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    public EvenOddNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {

            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " working");
            readWriteLock.readLock().lock();
            try{

                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 0) {
                            evenNumbers.add(numbers.get(i));
                            System.out.println(threadName + " working  -" + numbers.get(i) + "- Çift Sayý");
                    }

                    else{
                        oddNumbers.add(numbers.get(i));
                        System.out.println(threadName + " working  -" + numbers.get(i) + "- Tek Sayý");
                    }
                }
            }

            finally {
                readWriteLock.readLock().unlock();
            }

            ThreadSleeper.sleep(50);
            }
}
