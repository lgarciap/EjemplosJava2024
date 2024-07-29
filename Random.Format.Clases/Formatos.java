/*
Clase para probar los number formats
1/8/2012
Programacion orientada a objetos
*/
//importando las clases del paquete text
import java.text.*;
//importando la clase Locale del paquete Locale
import java.util.Locale;

public class Formatos
{
	public static void main(String[] args)
	{
		
		NumberFormat formato = NumberFormat.getCurrencyInstance();//Moneda de la localidad definida en la computadora
		NumberFormat dollarformat = NumberFormat.getCurrencyInstance(Locale.US);//Moneda de Estados Unidos (US)
		
		DecimalFormat decimal = new DecimalFormat(".%");//Para generar el formato del porciento
		DecimalFormat dosDecimales = new DecimalFormat(".##");//Para mantener solo dos lugares decimales
		
		String porciento = decimal.format(0.8); //80%
		double numeroFloat = 23.435355;
		String numero = dosDecimales.format(numeroFloat);//23.44
		
		//Como en mi computadora el simbolo de Moneda es Q saldra Q109 pero depende del formato de moneda de la computadora que lo corra
		String monedaPorDefecto = formato.format(109);
		//Va a mostrar el formato de moneda de Estados Unidos
		String dollar = dollarformat.format(109); //$109
		
		//Mostrando resultados
		System.out.println(porciento);
		System.out.println(numero);
		System.out.println(monedaPorDefecto);
		System.out.println(dollar);
	}
}
