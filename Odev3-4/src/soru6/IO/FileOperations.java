package soru6.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.nio.charset.StandardCharsets;



public class FileOperations {
	
	public static InputStream getInputStream(String path) {
		return FileOperations.class.getClassLoader().getResourceAsStream(path);
	}
	
	

	public static void write(String file, String content) {
		BufferedWriter bw = null;
		
		
		try {
			
			bw = new BufferedWriter(new FileWriter(file, true));
			bw.write(content);
			bw.write("\n");
			System.out.println("Kayýt Ýþlemi Tamamlandý");
			
		}
		
		catch(IOException e) {
			System.out.println(" Yazmada Bir Hata Oluþtu");
		}
		
		finally {
			try {
				if (bw != null) bw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static String read(InputStream inputStream) {
		InputStreamReader inputStreamReader= null;
		BufferedReader reader = null;
		
		try {
			inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
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
				if (inputStream != null) inputStream.close();
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
