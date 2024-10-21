public class Perro implements Hablante,Comparable {
    private String nombre;
    private String raza;
    private String color;
    private int edad;


    public Perro() {
    }


    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", raza='" + getRaza() + "'" +
            ", color='" + getColor() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }


    public String hablar() {
      return "Wouf, Wouf";
    }


    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        if (((Perro)o).getEdad()>this.edad)  
            resultado = -1;
        else
            if (((Perro)o).getEdad()<this.edad)
                resultado = 1;
        return resultado;

    }



}
