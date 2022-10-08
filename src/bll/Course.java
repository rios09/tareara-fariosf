package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dal.CourseDal;
import gui.CourseForm;
import ol.CCourse;


public class Course {
	private Scanner scan;
	private List<CCourse> Courses;
	
	public Course() {
		scan = new Scanner(System.in);
		Courses = new ArrayList<CCourse>();
	}
	
	public void course() {
		System.out.println("1. Abrir");
		System.out.println("2. Agregar");
		System.out.println("3. Asignar Docente");
		System.out.println("4. Guardar");
		System.out.println("5. Volver al menu principal\n");		
	}
	
	public void showCourse(){
		course();
		short op = scan.nextShort();
		
		while(op>5 || op<1) {
			System.out.println("La opcion ingresada no es correcta!\n");
			showCourse();
		}
		
		switch(op) {
		
		case 1: open();
			break; 
			
		case 2: add();
			break;
			
		case 3: assign();
			break;
			
		case 4: save();
			break;
			
		case 5:
			break;
			
		}
				
	}
	
	public void open() {
		System.out.println("Ingresa la ruta del archivo a abrir");
		String filePath = scan.next();
		CourseDal cd = new CourseDal();
		cd.setFilePath(filePath);	
		Courses = cd.openList();
		
		CourseForm cf = new CourseForm(Courses);
		cf.showCourses();
		
	}
	
	public void add() {
		CourseForm cf = new CourseForm(scan);
		Courses.add(cf.catchCourse());
		
	}
	
	public void assign() {
		
	}
	
	public void save() {
		
		CourseDal cd = new CourseDal();
		
		System.out.println("Ingresa la ruta para guardar el archivo: ");
		cd.setFilePath(scan.next());
		
		System.out.println("Igresa el nombre del archivo");
		cd.setFileName(scan.next());
		
		cd.setCourses(Courses);
		cd.saveList();
	}
}
