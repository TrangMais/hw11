package hw11_TwoCourseRegister.service;

public class FrontendCourse extends Course {
	
	public FrontendCourse(String fileName) {
		super.fileName = fileName;
	}

	@Override
	public void showWelcomeMessage() {
		System.out.println("Welcome to Frontend course");
	}

}
