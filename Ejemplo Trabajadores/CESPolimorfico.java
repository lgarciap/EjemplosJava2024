import java.util.ArrayList;
import java.util.Objects;

public class CESPolimorfico {
    private ArrayList<Trabajador> trabajadores;
    


    public CESPolimorfico() {
        this.trabajadores = new ArrayList<Trabajador>();
        
    }

    public CESPolimorfico(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
        
    }

   

    public float calcularSalarioDocentes(){
        float salario = 0;
        for (Trabajador trab:trabajadores){
            if (trab instanceof Docente)
                salario = salario + trab.calcularSalario();
        }
        return salario;
    }

    public float calcularSalarioNoDocentes(){
        float salario = 0;
        for (Trabajador trab:trabajadores){
            if (trab instanceof NoDocente)
                salario = salario + trab.calcularSalario();
        }
        return salario;
    }

    public float calcularNomina(){
        float suma = 0;
        for (Trabajador trab:trabajadores){
            suma = suma + trab.calcularSalario();
        }
        return suma;
    }

    public void agregarDocente(String nombre, String direccion, long dpi, String nit, 
    float salarioBase, int horasAusencia,int antiguedad, 
    boolean master, boolean doctorado){
        Docente maestro = new Docente(nombre, direccion, dpi, nit, salarioBase, horasAusencia, antiguedad, master, doctorado);
        trabajadores.add(maestro);   
    }

    public void agregarNoDocente(String nombre, String direccion, long dpi, String nit, float salarioBase, int horasAusencia,int cantFeriados){
        NoDocente administrativo = new NoDocente(nombre, direccion, dpi, nit, salarioBase, horasAusencia, cantFeriados);
        trabajadores.add(administrativo);
    }

    public float promedioAntiguedadDocentes(){
        float promedio = 0;
        int antique=0,cantDoc = 0;
        for (Trabajador trab:trabajadores){
            if (trab instanceof Docente){
                cantDoc++;
                antique = antique + ((Docente)trab).getAntiguedad();
            }
        }
        if (cantDoc != 0)
            promedio = antique/cantDoc;
        return promedio;
    }
    
}
