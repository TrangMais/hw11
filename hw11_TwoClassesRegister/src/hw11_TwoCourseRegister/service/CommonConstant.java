package hw11_TwoCourseRegister.service;

import java.util.ArrayList;

import hw11_TwoCourseRegister.dto.Student;

public class CommonConstant {
	
	//don't belongs to Student Class (POJO Class) or FrontendCourse and BackendCourse (Service Class)
	//if put these two lists in Student Class => break down the meaning of POJO Class
	static public ArrayList<Student> frontEndStudentList = new ArrayList<>();
	static public ArrayList<Student> backEndStudentList = new ArrayList<>();
}
