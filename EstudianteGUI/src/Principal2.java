import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreMateria="";
        float nota = 0;
        Semestre miSemestre = new Semestre();
        System.out.println("Agregue la primera asignatura: ");
        String rpta = "si";
        int i = 0;
        while (rpta.toLowerCase().equals("si")) {
            System.out.println("Ingrese el nombre de la materia "+(i+1)+": ");
            nombreMateria = teclado.nextLine();
            System.out.println("Ingrese la nota de la materia "+(i+1)+": ");
            nota = teclado.nextInt();
            teclado.nextLine();
            miSemestre.llenarAsignaturas(i, nombreMateria, nota);
            i++;
            System.out.println("¿Desea agregar otra materia? si o no");
            rpta = teclado.nextLine();
        }
        System.out.println("Mostrar la primera asignatura: ");
        System.out.println(miSemestre.getAsignaturas()[0].toString());
        System.out.println("Su promedio es: ");
        System.out.println(miSemestre.promedioGral());
        System.out.println("Su mejor clase es: ");
        System.out.println(miSemestre.mejorClase());
    }
}
