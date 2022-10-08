package bll;

import java.util.Scanner;


public class Group {
	Scanner scan = new Scanner(System.in);

	public void group() {
		System.out.println("1. Abrir");
		System.out.println("2. Agregar");
		System.out.println("3. Guardar");
		System.out.println("4. Volver al menu principal\n");		
	}
	
	public void showGroup(){
		group();
		short op = scan.nextShort();
		
		while(op>4 || op<1) {
			System.out.println("La opcion ingresada no es correcta!\n");
			showGroup();
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
			
		}
				
	}
}
