package bll;

import java.util.Scanner;


public class Students {
	Scanner scan = new Scanner(System.in);

	public void students() {
		System.out.println("1. Abrir");
		System.out.println("2. Agregar");
		System.out.println("3. Matricula");
		System.out.println("4. Guardar");
		System.out.println("5. Volver al menu principal\n");		
	}
	
	public void showStudents(){
		students();
		short op = scan.nextShort();
		
		while(op>5 || op<1) {
			System.out.println("La opcion ingresada no es correcta!\n");
			showStudents();
		}
		
		switch(op) {
		
		case 1:
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
						
		case 5: 
			break;
			
		}
				
	}
}
