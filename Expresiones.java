import java.util.Scanner;
public class Expresiones{
    public static void main(String[] args) {
        byte edad_byte = 9;
        short edad_short = 29;
        //widening por asignación
        edad_short = edad_byte;
        edad_short = 29;
        //narrowing por asignación
        //edad_byte = edad_short; No compila, da error de sintaxis
        System.out.println("edad_byte ="+edad_byte);
        edad_byte = (byte)edad_short;    // casting alias disfraz
        System.out.println("edad_byte ="+edad_byte);

        int result;
        result = (int)(edad_short/3.4f); //Yo puedo disfrazar toda una operación
        
        
        //SCANNER
        //1. importar antes de la declaración de la clase
        //2. declarar un objeto de tipo Scanner
        Scanner teclado = new Scanner(System.in);
        //3. Uso los métodos del objeto instanciado
        System.out.println("Escriba su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Escriba el día en que nació: ");
        int dia = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Escriba el nombre del mes en que nació: ");
        String mes = teclado.nextLine();
        System.out.println("Escriba el año en que nació: ");
        int anio = teclado.nextInt();
        String fechaNac = dia + "/" + mes + "/" + anio;
        System.out.println("Su fecha de nacimiento es: "+fechaNac);
        


    }
}