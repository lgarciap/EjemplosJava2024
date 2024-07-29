import java.util.Scanner;
public class PruebaString{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String cadena1 = "Hola";
		String cadena2 = "Hola";
		System.out.println("Ingrese una cadena");
		String cadena3 = teclado.nextLine();
		
		String dosUlt = cadena3.substring(cadena3.length()-2);
		/*
		if (cadena1 == cadena2)
			System.out.println("Son iguales");
			System.out.println("cadena1 = "+cadena1);
				System.out.println("cadena3 = "+cadena3);
		if (cadena1.equals(cadena3)){
			System.out.println("cadena1 y 3 son iguales");
		}
		else 
			System.out.println("cadena1 y 3 NO son iguales");
		*/
		
	}
}