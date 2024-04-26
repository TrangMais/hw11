package hw11_TwoCourseRegister.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import hw11_TwoCourseRegister.dto.Student;

public abstract class Course {
	
	public String fileName;
	
	public abstract void showWelcomeMessage();
	
	static public Course courseCreation(int selectedCourse) {
		if (selectedCourse == 2) {
			return new FrontendCourse("fe.csv");
		} else {
			return new BackendCourse("be.txt");
		}
	}
	
	// read a file => return an Array List
	public ArrayList<Student> readDataFromFile() {						// return to listStudent (list of student # list of String) 
		try {										// when coding, all of code lines should be in "try" so that "catch" can find all error occurred and return to null
			ArrayList<Student> list = new ArrayList<Student>(); 			// create a empty string
			File fileToRead = new File(fileName);					// read the file "be.txt"
			
			// Imagine: Inside file "be.txt", there are two lines of student information
			// "dung,090909,12/12/1991"
			// "dung1,090909,12/12/1991"
			Scanner scanInput = new Scanner(fileToRead);				// scanner to loop line-by-line in the file "be.txt"
			while (scanInput.hasNextLine()) {					
				String data = scanInput.nextLine();				// every data from line scanner with be A data in LIST
				String [] elementArray = data.split(",");			// split function => will follow the "," and cut it and transfer the above STRING to INDEX of List
												// after cutting, ARRAY will be ["dung" - INDEX 1, "090909" - INDEX 2, "12/12/1991" - INDEX 3]
				Student eachStudent = new Student(elementArray[0].trim(), elementArray[1].trim(), elementArray[2].trim()); 
												// using trim() to cut down 2 side whitespace around the INDEX
				list.add(eachStudent);						// add each student in the LIST
			}
			return list;
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred when reading file");
		}
		return new ArrayList<Student>();
	}
	
	public ArrayList<Student> writeDataIntoFile(){
		FileWriter writer;
		try {
			ArrayList<Student> list = new ArrayList<Student>();
			writer = new FileWriter(fileName);
			for (Student eachStudent : list) {
				writer.write(eachStudent.name + "," + eachStudent.phone + "," + eachStudent.dateOfBirth + ",");
			}
			System.out.println("Registered sucessfully!");
		} catch (IOException e) {
			System.out.println("An error occurred when reading file");
		}
		return null;
	}			
}
