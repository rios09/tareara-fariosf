package bll;

import java.util.Scanner;

public class Teachers {
	Scanner scan = new Scanner(System.in);

	public void teachers() {
		System.out.println("1. Abrir");
		System.out.println("2. Agregar");
		System.out.println("3. Asignar Grupo");
		System.out.println("4. Asignar Asignatura");
		System.out.println("5. Guardar");
		System.out.println("6. Volver al menu principal\n");		
	}
	
	public void showTeachers(){
		teachers();
		short op = scan.nextShort();
		
		while(op>6 || op<1) {
			System.out.println("La opcion ingresada no es correcta!\n");
			showTeachers();
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
						
		case 6: 
			break;
			
		}
				
	}
}
