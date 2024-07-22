import java.util.Vector;

/**
 * Esta clase se encarga de modelar el vino 
 * @author POO sección 40
 * @date 12/07/2024
 */
public class Vino{
    private String nombre;
    private int cosecha;
    private String tipo;
    private int dispMinima;
    private int dispMaxima;
    private int dispReal;
    private Suministrador proveedor;
    private Venta venta[];
    private double precio;
    
    public Vino(){
        nombre = "";
        cosecha = 0;
        tipo = "";
        dispMinima = 0;
        dispMaxima = 0;
        dispReal = 0;
        precio = 0;
        proveedor = new Suministrador();
        venta = new Venta[1000];
    }

    //    private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //private int cosecha;
    public int getCosecha(){
        return this.cosecha;
    }
    public void setCosecha(int cosecha){
        this.cosecha = cosecha;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDispMinima() {
        return this.dispMinima;
    }

    public void setDispMinima(int dispMinima) {
        this.dispMinima = dispMinima;
    }

    public int getDispMaxima() {
        return this.dispMaxima;
    }

    public void setDispMaxima(int dispMaxima) {
        this.dispMaxima = dispMaxima;
    }

    public int getDispReal() {
        return this.dispReal;
    }

    public void setDispReal(int dispReal) {
        this.dispReal = dispReal;
    }

    public Suministrador getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(Suministrador proveedor) {
        this.proveedor = proveedor;
    }

    public Venta getVenta[]() {
        return this.venta[];
    }

    public void setVenta[](Venta venta[]) {
        this.venta[] = venta[];
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String toString() {
        return 
            "nombre:" + getNombre() + 
            "\ncosecha='" + getCosecha() + 
            "\ntipo='" + getTipo() + 
            "\ndispMinima='" + getDispMinima() +
            "\ndispMaxima='" + getDispMaxima() +
            "\ndispReal='" + getDispReal() + 
            "\nproveedor='" + getProveedor() +
            "\nventa[]='" + getVenta[]() + 
            "\nprecio='" + getPrecio() + 
            "\ngetVenta[]='" + getGetVenta[]() + 
            "\nventa[]='" + getVenta[]();
    }
    
    
    
}