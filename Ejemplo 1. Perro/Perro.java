public class Perro {
    //Atributos
    private String raza;
    private String nombre;
    private double peso;
    private int edad;
    private String color;
    private boolean sexo; //true: hembra, false: macho
    private String tamanio;

    //Métodos
    public Perro(){
        this.raza = "mayan terrier";
        this.nombre = "";
        this.peso = 0;
        this.edad = 0;
        color = "";
        sexo = true;
        tamanio = "pequeño";
    }

    public String ladra(){
        return "Guau guau";
    } 
    public String come(){
        return "yumi yumi";
    } 
    public String corre(){
        return "corre corre";
    } 


    //private String raza;
    public String getRaza(){
        return this.raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

        //private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //private double peso;
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    //private int edad;
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){

        this.edad = edad;
    }
    //private String color;
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //private boolean sexo; //true: hembra, false: macho
    public boolean getSexo(){
        return this.sexo;
    }
    public void setSexo(boolean sexo){
        this.sexo = sexo;
    }
    
    //private String tamanio;
    
    public String getTamanio(){
        return this.tamanio;
    }
    public void setTamanio(String tamanio){
        this.tamanio = tamanio;
    }

    public String toString(){
        String cadena = "Nombre: "+nombre+"\nRaza: "+raza+"\nPeso: "+peso+
        "\nEdad: "+edad+"\nColor: "+color;
        if (sexo == true){
            cadena = cadena + "\nSexo: Hembra";
        }
        else{
            cadena = cadena + "\nSexo: Macho";
        }
        return cadena;

    }

    public boolean equals(Perro otroPerro){
        /*
            private String raza;
    private String nombre;
    private double peso;
    private int edad;
    private String color;
    private boolean sexo; //true: hembra, false: macho
    private String tamanio;
        */ 
        if (otroPerro.getRaza().equals(this.raza) &&
            otroPerro.getNombre().equals(this.nombre) &&
            otroPerro.getPeso() == this.peso &&
            otroPerro.getEdad() == this.edad &&
            otroPerro.getColor().equals(this.color) &&
            otroPerro.getSexo() == this.sexo &&
            otroPerro.getTamanio()==this.tamanio
        ){
            return true;
        }
        else{
            return false;
        }
    }
}