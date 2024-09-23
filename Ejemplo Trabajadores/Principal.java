import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CES uvg =  new CES();
        String nombre, direccion, nit;
        long dpi;
        float salarioBase;
        int horasAusencia, antiguedad, feriados;
        boolean master = false;
        boolean doctor = false;

        String rpta = "si";
        while (rpta.equalsIgnoreCase("si")) {

            System.out.println("ingrese 1 si va a ingresar un docente y 2 si va ingresar un no docente: ");
            int tipo = teclado.nextInt();
            teclado.nextLine();
                    
            System.out.println("Ingrese el nombre del trabajador");
            nombre = teclado.nextLine();
            System.out.println("Ingrese la direccion del trabajador");
            direccion = teclado.nextLine();
            System.out.println("Ingrese el NIT del trabajador");
            nit = teclado.nextLine();
            System.out.println("Ingrese el DPI del trabajador");
            dpi = teclado.nextLong();
            teclado.nextLine();
            System.out.println("Ingrese el salario base del trabajador");
            salarioBase = teclado.nextFloat();
            teclado.nextLine();
            System.out.println("Ingrese el numero de horas de ausencia del trabajador");
            horasAusencia = teclado.nextInt();
            teclado.nextLine();
            if (tipo == 1){
                System.out.println("Ingrese la antiguedad del trabajador");
                antiguedad = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese 1 si es master y 2 si es doctor");
                int opcion = teclado.nextInt();
                teclado.nextLine();
                if (opcion == 1)
                    master = true;
                if (opcion == 2) 
                    doctor = true;
                uvg.agregarDocente(nombre, direccion, dpi, nit, salarioBase, horasAusencia, antiguedad, master, doctor);
            }
            if (tipo == 2){
                System.out.println("Ingrese la cantidad de feriados trabajados por el trabajador");
                feriados = teclado.nextInt();
                teclado.nextLine();
                uvg.agregarNoDocente(nombre, direccion, dpi, nit, salarioBase, horasAusencia, feriados);
            }

            System.out.println("¿Desea ingresar otro trabajador? Si o No");
            rpta = teclado.nextLine();
            
        }

        float salarioDoc = uvg.calcularSalarioDocentes();
        float salarioNoDoc = uvg.calcularSalarioNoDocentes();
        float nomina = uvg.calcularNomina();

        System.out.println("El salario total para docentes es: "+salarioDoc);
        System.out.println("El salario total para no docentes es: "+salarioNoDoc);
        System.out.println("La nómina es: "+nomina);

        
    }
}
