public class NoDocente extends Trabajador {
    private int cantFeriados;


    public NoDocente() {
        super();
        this.cantFeriados = 0;
    }


    public NoDocente(String nombre, String direccion, long dpi, String nit, float salarioBase, int horasAusencia,int cantFeriados) {
        super(nombre, direccion, dpi, nit, salarioBase, horasAusencia);
        this.cantFeriados = cantFeriados;
    }


    public int getCantFeriados() {
        return this.cantFeriados;
    }

    public void setCantFeriados(int cantFeriados) {
        this.cantFeriados = cantFeriados;
    }


    @Override
    public String toString() {
        return "{" +
            " cantFeriados='" + getCantFeriados() + "'" +
            "}";
    }

    public float calcularSalario(){
        float tarifaDiaria = this.salarioBase/24;
        float extraFeriados = tarifaDiaria*2*cantFeriados;
        float salario = super.calcularSalario()+extraFeriados;
        return salario;
    }


    
}
