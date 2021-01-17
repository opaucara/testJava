package day1.FactoryPattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * Definir superClass como variable me permite abstarme de que tipo de clase se puede haber instanciado
		 * y solo hago uso de sus metodos los cuales fueron implementados en las subclasses
		 * 
		 * 		Interface Calculate(a, b)
		 * 		Class Suma extends Calculate, return a + b
		 * 		Class Rest extends Calculate, return a - b
		 * Desde main
		 * Calculate operacion = new Suma(a,b);
		 * , operacion.calculate(a,b)
		 * 
		 * El uso de superClase como tipo de objecto me es muy util en el Factory Patter
		 * */
		System.out.print("Test");
		
		//Ingresar por input!
		Scanner input = new Scanner(System.in);
		Double num1 = input.nextDouble();
		
		Double num2 = input.nextDouble();
		System.out.print(43);
	}

}
