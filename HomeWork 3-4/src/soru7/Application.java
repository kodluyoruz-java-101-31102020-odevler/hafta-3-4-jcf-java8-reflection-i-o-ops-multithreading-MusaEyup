package soru7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
        for (int i  = 0; i < 10000 ; i++) {
            numbers.add(i + 1);
        }

        ExecutorService executor = Executors.newFixedThreadPool(4);

        int firstIndex = 0, lastIndex = 2500;

        for (int i = 0; i < 4; i++){

            EvenOddNumbers evenOddNumbers = new EvenOddNumbers( numbers.subList(firstIndex,lastIndex));
            firstIndex += 2500;
            lastIndex += 2500;
            executor.execute(evenOddNumbers);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }


        System.out.println("Tek Sayýlar");
        EvenOddNumbers.oddNumbers.stream().sorted().forEach(number->{
            System.out.print(number + " ");
        });
        System.out.println("\nÇift Sayýlar");
        EvenOddNumbers.evenNumbers.stream().sorted().forEach(number->{
            System.out.print(number + " ");
        });

	}

}
