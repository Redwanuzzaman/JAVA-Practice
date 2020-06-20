package com.bkash;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static final String ABSOLUTE_PATH = "C:/Users/Md Redwanuzzaman/Desktop";
	private static Stream<Path> files;
	
	public static void main(String[] args) {
		// 1. CREATING NEW FOLDER
		
		File mainFolder = new File(ABSOLUTE_PATH + "/Main Folder");
		mainFolder.mkdir();
		
		File subFolder1 = new File(ABSOLUTE_PATH + "/Sub Folder 1");
		subFolder1.mkdir();
		
		
		// 2. CREATING NEW FILE
		
		File newFile = new File(ABSOLUTE_PATH + "/File 1.txt");
		
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 3. ADDING FILE TO FOLDER
		
		String file1Location = ABSOLUTE_PATH + "/File 1.txt";
		
		try {
			Files.move(Paths.get(file1Location), Paths.get(ABSOLUTE_PATH + "/Main Folder/File 1.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 4. ADDING FOLDER TO FOLDER
		
		String subFolder1Location = ABSOLUTE_PATH + "/Sub Folder 1";
		try {
			Files.move(Paths.get(subFolder1Location), Paths.get(ABSOLUTE_PATH + "/Main Folder/Sub Folder 1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 5. WRITE CONTENT TO A FILE
		String toWrite = "Hello bKash!";
		try {
			FileWriter fw = new FileWriter(ABSOLUTE_PATH + "/Main Folder/File 1.txt");
			fw.write(toWrite);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// 6. CLEAR THE FILE WITHOUT DELETING IT
		
//		try {
//			PrintWriter writer = new PrintWriter(ABSOLUTE_PATH + "/Main Folder/File 1.txt");
//			writer.print("");
//			writer.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		// 7. GET THE SIZE OF THE CONTENT OF THE FILE
		File file = null;
		try {
			file = new File(ABSOLUTE_PATH + "/Main Folder/File 1.txt");
			boolean isExist = file.exists();
			if(isExist) {
				System.out.println("Size of the File is: " + file.length());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 8. GET THE SIZE OF THE FOLDER
		
		try {
            files = Files.list(Paths.get(ABSOLUTE_PATH + "/Main Folder"));
            long count = files.count();
            System.out.println("Number of files in the folder: " + count);
        } catch(Exception e){
            e.printStackTrace();
        }
		
		
		// 9. PRINT THE FILE/FOLDER NAMES INSIDE A FOLDER
		
		
	}

}
