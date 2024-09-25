package Programa1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	System.out.println("Dime el nombre de un alumno");
		String NombreDelAlumno = entrada.next();
	
	System.out.println("Notas");
	System.out.println("Mates");
		double Mates = entrada.nextDouble();
	System.out.println("Lengua");
		double Lengua = entrada.nextDouble();
	System.out.println("Historia");
		double Historia = entrada.nextDouble();
	System.out.println("Bio");
		double Bio = entrada.nextDouble();
	System.out.println("Ingles");
		double Ingles = entrada.nextDouble();
	
	double media = (Mates+Lengua+Ingles+Bio+Historia)/5;
	System.out.println("La media es de:");
	System.out.println(media);
	
	if((Mates>= 5) && (Lengua>= 5) && (Bio>= 5) && (Historia>=5 ) && (Ingles>= 5))  {
		System.out.println("Aprobado");}
		
	else {
		System.out.println("Repite");
	}
}

}