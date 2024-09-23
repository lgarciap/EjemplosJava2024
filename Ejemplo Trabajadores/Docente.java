public class Docente extends Trabajador{
    private int antiguedad; //en años
    private boolean master;
    private boolean doctorado;


    public Docente() {
        super();
    }


    public Docente(String nombre, String direccion, long dpi, String nit, 
                    float salarioBase, int horasAusencia,int antiguedad, 
                    boolean master, boolean doctorado) {
        super(nombre, direccion, dpi, nit, salarioBase, horasAusencia);
        this.antiguedad = antiguedad;
        this.master = master;
        this.doctorado = doctorado;
    }


    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public boolean isMaster() {
        return this.master;
    }

    public boolean getMaster() {
        return this.master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    public boolean isDoctorado() {
        return this.doctorado;
    }

    public boolean getDoctorado() {
        return this.doctorado;
    }

    public void setDoctorado(boolean doctorado) {
        this.doctorado = doctorado;
    }

    @Override
    public String toString() {
        return "{" +
            " antiguedad='" + getAntiguedad() + "'" +
            ", master='" + isMaster() + "'" +
            ", doctorado='" + isDoctorado() + "'" +
            "}";
    }

    public float calcularSalario(){
        float salario = super.calcularSalario()+ plusAntiguedad()+plusGradoCientifico();
        return salario;
    }

    public int plusGradoCientifico(){
        int plus = (this.master)?80:(this.doctorado)?120:0;
        /*
        if (this.master == true)
            plus = 80;
        else{
            if (this.doctorado == true)
                plus = 120;
            else
                plus = 0;
        }
        */
        return plus;
    }

    public float plusAntiguedad(){
        return (float)(Math.floor(antiguedad/5)*20.0);
    }
    

}