package soru6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;



public class FileOperations {

	public static InputStream getInputStream(String path) {
		return FileOperations.class.getClassLoader().getResourceAsStream(path);
	}
	
	public static void write(File file, String content) {
		FileWriter fw= null;
		BufferedWriter bw = null;
		
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
		
			bw.write(content);
			bw.write("\n");
			
			System.out.println("Kayýt Ýþlemi Tamamlandý");
			
		}
		
		catch(IOException e) {
			System.out.println(" Yazmada Bir Hata Oluþtu");
		}
		
		finally {
			try {
				
				if(fw != null) fw.close();
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static String read(InputStream is) {
		InputStreamReader inputStreamReader= null;
		BufferedReader reader = null;
		
		try {
			inputStreamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
			reader = new BufferedReader(inputStreamReader);
			String line;
			StringBuilder builder = new StringBuilder();
			
			while((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append("\n");
				
			}
			return builder.toString();
		}
		catch(IOException e) {
			System.out.println("Okumada bir hata oluþtu");
		}
		finally {
			try {
				if (is != null) is.close();
				if (inputStreamReader != null) inputStreamReader.close();
				if (reader != null) reader.close();
			}
			catch(IOException e){
				System.out.println("kapatmada bir hata oluþtu");
			}
		}
		return "";
	}
}
