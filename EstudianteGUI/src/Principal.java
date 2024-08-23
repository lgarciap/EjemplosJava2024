import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreMateria="";
        float nota = 0;
        System.out.println("Ingrese la cantidad de materias: ");
        int cant = teclado.nextInt();
        Semestre miSemestre = new Semestre(cant);
        teclado.nextLine();
        for(int i=0;i<cant;i++){
            System.out.println("Ingrese el nombre de la materia "+(i+1)+": ");
            nombreMateria = teclado.nextLine();
            System.out.println("Ingrese la nota de la materia "+(i+1)+": ");
            nota = teclado.nextInt();
            teclado.nextLine();
            miSemestre.llenarAsignaturas(i, nombreMateria, nota);
        }

        System.out.println("Mostrar la primera asignatura: ");
        System.out.println(miSemestre.getAsignaturas()[0].toString());
        System.out.println("Su promedio es: ");
        System.out.println(miSemestre.promedioGral());
        System.out.println("Su mejor clase es: ");
        System.out.println(miSemestre.mejorClase());

    }
}
