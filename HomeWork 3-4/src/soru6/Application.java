package soru6;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Application {
	public static void main(String[] args) throws URISyntaxException {
		write();
		read();
		

	}
	
	public static void write() throws URISyntaxException {
		String ogrenciBilgileri = addStudent();
		String filePath = "archive/kayit.txt";
		System.out.println(ogrenciBilgileri);
		File file = new File(filePath);
		FileOperations.write(file, ogrenciBilgileri);
	}
	
	public static void read() {
		String filePath = "kayit.txt";
		InputStream inputStream = FileOperations.getInputStream(filePath);
		String archive = FileOperations.read(inputStream);
		System.out.println(archive);
	}
	
	
	
	public static String addStudent() {
		
		Scanner scanner = new Scanner(System.in);
        String id, name, lastName, department;
        int age;

        System.out.print("Ogrenci Numarasý: ");
        id = scanner.nextLine();
        System.out.print("Ad: ");
        name = scanner.nextLine();
        System.out.print("Soyad: ");
        lastName = scanner.nextLine();
        System.out.print("Bölüm: ");
        department = scanner.nextLine();
        System.out.print("Yaþ: ");
        age = scanner.nextInt();
        
        scanner.close();
        Student student = new Student(id, name, lastName, age, department);
        return student.toString();
		
	}

}
	