package bll;

import java.util.Scanner;



public class App {

	private Scanner scan;
	public App() {
		scan = new Scanner(System.in);
	}


	
	public void menu() {
		System.out.println("Bienvenido al Simulador de un sistema Academico\n"
				+ "A continuacion digite la opcion a la que desea acceder: ");
		System.out.println("1. Asignaturas");
		System.out.println("2. Grupos");
		System.out.println("3. Profesores");
		System.out.println("4. Estudiantes");
		System.out.println("5. Salir del programa\n");		
	}
	
	public void showMenu() {
		short option = 0;
		do {
			System.out.println();
			menu();
			option = scan.nextShort();
			System.out.println();
			
			switch(option) {
			case 1: Course a = new Course();
					a.showCourse();
				break;
				
			case 2: Group g = new Group();
					g.showGroup();
				break;
				
			case 3: Teachers t = new Teachers();
					t.showTeachers();
				break;
				
			case 4: Students s = new Students();
					s.showStudents();
				break;
				
			case 5: System.exit(0);
				break;
				
			default: System.out.println("La opcion no es valida, intenta nuevamente");
					
			}
			
		}while (option!=5);
		
		
	}
	
}
