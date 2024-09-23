public class Trabajador{
    private String nombre;
    private String direccion;
    private long dpi;
    private String nit;
    protected float salarioBase;
    protected int horasAusencia;


    public Trabajador() {
        nombre = "";
        direccion = "algun lugar en Guate";
        dpi = 0;
        nit = "";
        salarioBase = 0;
        horasAusencia = 0;
    }


    public Trabajador(String nombre, String direccion, long dpi, String nit, float salarioBase, int horasAusencia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dpi = dpi;
        this.nit = nit;
        this.salarioBase = salarioBase;
        this.horasAusencia = horasAusencia;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getDpi() {
        return this.dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasAusencia() {
        return this.horasAusencia;
    }

    public void setHorasAusencia(int horasAusencia) {
        this.horasAusencia = horasAusencia;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", dpi='" + getDpi() + "'" +
            ", nit='" + getNit() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            ", horasAusencia='" + getHorasAusencia() + "'" +
            "}";
    }

    public float calcularSalario(){
        float tarifaHoraria = this.salarioBase/192;
        float descuentoAusencias =  tarifaHoraria * this.horasAusencia;
        return salarioBase-descuentoAusencias;
    }


}