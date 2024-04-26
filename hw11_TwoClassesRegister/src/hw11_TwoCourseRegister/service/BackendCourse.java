package hw11_TwoCourseRegister.service;

public class BackendCourse extends Course{
	
	public BackendCourse(String fileName) {
		super.fileName = fileName;
	}

	@Override
	public void showWelcomeMessage() {
		System.out.println("Welcome to Backend course");
	}										
	
}
