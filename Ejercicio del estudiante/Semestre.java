public class Semestre {
    private Materia[] asignaturas;

    public Semestre(){
        asignaturas = new Materia[50];
    }

    public Semestre(int cant){
        asignaturas = new Materia[cant];
    }

    public void llenarAsignaturas(int i, String nombre, float nota){
        asignaturas[i] = new Materia(nombre, nota);
    }

    public Materia[] getAsignaturas() {
        return this.asignaturas;
    }

    public double promedioGral(){
        double suma = 0;
        int cant = 0;
        for (Materia asig:asignaturas){
            if (asig != null){
                suma = suma + asig.getNota();
                cant++;
            }

        }
        return suma / cant; 
    }

    public String mejorClase(){
        float mejor = 0;
        String mejorClase = "";
        for (Materia asig:asignaturas){
            if (asig.getNota() > mejor) {
                mejor = asig.getNota();
                mejorClase = asig.getNombre();
            }
        }
        return mejorClase;

    }

    
    
}
