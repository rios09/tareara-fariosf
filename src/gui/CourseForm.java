package gui;

import java.util.List;
import java.util.Scanner;

import ol.CCourse;

public class CourseForm{
	
	private Scanner scan;
	private CCourse Course;
	private List<CCourse> Courses;
	
	public CourseForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public CourseForm(CCourse Course) {
		super();
		this.Course = Course;
	}
	
	public CourseForm(List<CCourse> Courses) {
		super();
		this.Courses = Courses;
	}
	
	
	public CCourse catchCourse() {
		CCourse c = new CCourse();
		System.out.println("Nombre de la Asignatura: ");
		c.setCourseTitle(scan.next());
		
		System.out.println("ID de la Asignatura: ");
		c.setCourseId(scan.nextLong());
		return c;
	}
	
	
	
	public void showCourses() {
		for(int i=0; i<Courses.size(); i++) {
			System.out.printf("%d | %s |%d\n", i+1, Courses.get(i).getCourseTitle(), Courses.get(i).getCourseId());
			
		}
		
	}
}
