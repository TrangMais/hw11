package hw11_TwoCourseRegister;

import java.util.ArrayList;
import java.util.Scanner;

import hw11_TwoCourseRegister.dto.Student;
import hw11_TwoCourseRegister.service.Course;
public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		final int BACK_END = 1;
		final int FRONT_END = 2;
		
		Course course = null;
		
		ArrayList<Student> studentList = null;
		
		while(true) {
			//ask for selecting course
			int selectedCourse = selectCourse();
			course = Course.courseCreation(selectedCourse);
			
			// show the Welcome Message 
			course.showWelcomeMessage();
			
			// automatically read the file from the selected course to show the data file STUDENT LIST
			studentList = course.readDataFromFile();
			
			//If there is a file, show the student list from data file
			hw11_TwoCourseRegister.service.Ultility_Table.printClass(studentList);
			
			// if there is no file, ask student input their information
			String studentName;
			String studentPhone;
			String studentDOB;
			System.out.println("Please fill in your details: ");
			Scanner scanInput = new Scanner(System.in);
			
			System.out.println("Your name: ");
			while (true) { 										// verify user input
				if (scanInput.hasNextLine()) {
					studentName = scanInput.next();
					break;
				} else {
					System.out.println("Invalid input.Please try again:");
					scanInput.next();
				}
			}

			System.out.println("Your mobile number: ");
			while (true) { // verify user input
				if (scanInput.hasNextLine()) {
					studentPhone = scanInput.next();
					break;
				} else {
					System.out.println("Invalid input.Please try again:");
					scanInput.next();
				}
			}

			System.out.println("Your Date of Birth: ");
			while (true) { // verify user input
				if (scanInput.hasNextLine()) {
					studentDOB = scanInput.next();
					break;
				} else {
					System.out.println("Invalid input.Please try again:");
					scanInput.next();
				}
			}
		}
	}
	
	public static int selectCourse() {
		System.out.println("Please select your course: ");
		System.out.println("1. Backend Course");
		System.out.println("2. Frontend Course");
		Scanner userInput = new Scanner(System.in);
		int selectedCourse = 0;
			
		while(true) {//Verify user input
			if(userInput.hasNextInt()) {
				selectedCourse = userInput.nextInt();
				while(selectedCourse<1 || selectedCourse>2) {
					System.out.println("Invaid input. Please try again");
					selectedCourse = userInput.nextInt();
				}
				break;
			}else {
				System.out.println("Invaid input. Please try again.");
				userInput.next();
			}
		}
		return selectedCourse;
	}
		
}

