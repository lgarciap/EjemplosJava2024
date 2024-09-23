import java.util.ArrayList;
import java.util.Objects;

public class CES {
    private ArrayList<Docente> docentes;
    private ArrayList<NoDocente> noDocentes;


    public CES() {
        this.docentes = new ArrayList<Docente>();
        this.noDocentes = new ArrayList<NoDocente>();
    }

    public CES(ArrayList<Docente> docentes, ArrayList<NoDocente> noDocentes) {
        this.docentes = docentes;
        this.noDocentes = noDocentes;
    }

    public ArrayList<Docente> getDocentes() {
        return this.docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<NoDocente> getNoDocentes() {
        return this.noDocentes;
    }

    public void setNoDocentes(ArrayList<NoDocente> noDocentes) {
        this.noDocentes = noDocentes;
    }

    public CES docentes(ArrayList<Docente> docentes) {
        setDocentes(docentes);
        return this;
    }

    public CES noDocentes(ArrayList<NoDocente> noDocentes) {
        setNoDocentes(noDocentes);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CES)) {
            return false;
        }
        CES cES = (CES) o;
        return Objects.equals(docentes, cES.docentes) && Objects.equals(noDocentes, cES.noDocentes);
    }

    @Override
    public String toString() {
        return "{" +
            " docentes='" + getDocentes() + "'" +
            ", noDocentes='" + getNoDocentes() + "'" +
            "}";
    }

    public float calcularSalarioDocentes(){
        float salario = 0;
        for (Docente maestro:docentes){
            salario = salario + maestro.calcularSalario();
        }
        return salario;
    }

    public float calcularSalarioNoDocentes(){
        float salario = 0;
        for (NoDocente administrativo:noDocentes){
            salario = salario + administrativo.calcularSalario();
        }
        return salario;
    }

    public float calcularNomina(){
        return calcularSalarioDocentes() + calcularSalarioNoDocentes();
    }

    public void agregarDocente(String nombre, String direccion, long dpi, String nit, 
    float salarioBase, int horasAusencia,int antiguedad, 
    boolean master, boolean doctorado){
        Docente maestro = new Docente(nombre, direccion, dpi, nit, salarioBase, horasAusencia, antiguedad, master, doctorado);
        docentes.add(maestro);   
    }

    public void agregarNoDocente(String nombre, String direccion, long dpi, String nit, float salarioBase, int horasAusencia,int cantFeriados){
        NoDocente administrativo = new NoDocente(nombre, direccion, dpi, nit, salarioBase, horasAusencia, cantFeriados);
        noDocentes.add(administrativo);
    }
    
}
