package Programa2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in);
	System.out.println("Tipo de cliente(Nomral/Socio/Vip)");
		String Tipodecliente = entrada.next();
	System.out.println("Importe de la compra");
		double importe = entrada.nextDouble();
		
	/*if(Tipodecliente.equals("Normal"))  {
			System.out.println(importe);}
	
	(Tipodecliente.equals("Socio"))  {
		importe = importe%5;
		System.out.println(importe);} */
	
	/* if(Tipodecliente.equals("Vip"))  {
		importe = importe%20;
		System.out.println(importe);} */

	switch(Tipodecliente) {
	case "Normal" :
		System.out.println(importe);
		// Break (Terminar un control de flujo )
		break;
	case "Socio" :
		importe = importe*95/100 ;
		System.out.println(importe);
		break;
	case "Vip" :
		importe = importe*80/100 ;
		System.out.println(importe);
		break;
	
	}
	


	}
}

