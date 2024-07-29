import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ejemplo{
    public static void main(String[] args) {
        //Random
        Random aleatorio = new Random(); //Se crea el objeto de la clase Random
        int numAl1 = aleatorio.nextInt(10); //Genera un número aleatorio entero de 0 a 9
        int numAl3 = aleatorio.nextInt(11)+10; //Genera un número aleatorio entero de 10 a 20
        float numAl4 = aleatorio.nextFloat(); //Genera un número aleatorio con punto decimal entre 0.0 y 1.0
        aleatorio.setSeed(123); //Pone una semilla para que genere siempre el mismo número aleatorio
        System.out.println("numAl1: "+numAl1);
        System.out.println("numAl3: "+numAl3);
        System.out.println("numAl4: "+numAl4);
        int numAl2 = aleatorio.nextInt(10); //Genera un número aleatorio usando la semilla
        System.out.println("numAl2: "+numAl2);
        //Wrapper
        Integer numeroInt = 0;
        int enteroPrimitivo = 10;
        numeroInt = enteroPrimitivo; 
        enteroPrimitivo = numeroInt;
        enteroPrimitivo = Integer.parseInt("2");
        System.out.println(Math.sqrt(2.56));
        NumberFormat formato = NumberFormat.getCurrencyInstance();//Moneda de la localidad definida en la computadora
        System.out.println(formato.format(100));
        NumberFormat formatoUSD = NumberFormat.getCurrencyInstance(Locale.US);//Moneda de la localidad definida en la computadora
        System.out.println(formatoUSD.format(100));

        NumberFormat formatoEu = NumberFormat.getCurrencyInstance(Locale.JAPAN);//Moneda de la localidad definida en la computadora
        System.out.println(formatoUSD.format(100));
    }
}