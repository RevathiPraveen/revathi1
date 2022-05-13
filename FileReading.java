package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReading {
	Scanner scan = new Scanner(System.in);
	File oFile = new File("D:sample.txt");
	void fileCreation() {

	try {
	if (oFile.createNewFile()) {
	System.out.println("file created");
	} else {
	System.out.println("file already exists");
	}

	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	
	
	void read() {
		String line;
		int lineCount=0, wordsCount=0;
		try {
		FileReader read = new FileReader("D:sample.txt");
		BufferedReader buffer1 = new BufferedReader(read);
//read data line-by-line by used readine method

		while((line=buffer1.readLine())!=null) {
		lineCount++;
		String []words = line.split(" ");
		wordsCount = wordsCount+words.length;
		}
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			}
			System.out.println("No of Lines" + lineCount);
			System.out.println("No of words" + wordsCount);
			}
			}

	


