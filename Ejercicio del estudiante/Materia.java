public class Materia{
    private String nombre;
    private float nota;


    public Materia() {
        nombre = "";
        nota = 0;
    }


    public Materia(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nota='" + getNota() + "'" +
            "}";
    }

    public boolean equals(Materia otraMateria){
        if (this.nombre.equals(otraMateria.getNombre()) && this.nota == otraMateria.getNota())
            return true;
        else
            return false;
    }



}