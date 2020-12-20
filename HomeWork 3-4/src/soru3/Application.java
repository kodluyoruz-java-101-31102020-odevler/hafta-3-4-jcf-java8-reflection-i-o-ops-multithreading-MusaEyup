package soru3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int add;
        Scanner scanner;
        Map<String, Student> studentMap = new HashMap<>();

        do {
            scanner = new Scanner(System.in);
            String number, name, lastName;
            int age;

            System.out.print("Ogrenci Numarasý: ");
            number = scanner.nextLine();
            System.out.print("Ad: ");
            name = scanner.nextLine();
            System.out.print("Soyad: ");
            lastName = scanner.nextLine();
            System.out.print("Yaþ: ");
            age = scanner.nextInt();

            studentMap.put(number, new Student(number, name, lastName,age));
            System.out.println("Baþka bir öðrenci ekemek için: 1\nProgram sonlandýr: 0");
            add = scanner.nextInt();

        }while(add != 0);

        scanner.close();
        System.out.println(studentMap);
    }
	
}
