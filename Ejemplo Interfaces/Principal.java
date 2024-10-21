public class Principal{
    public static void main(String[] args) {
        Hablante orador = new Filosofo();    
        System.out.println(orador.hablar());
        System.out.println("Y les presento a mi firulais ");
        Hablante firu = new Perro("Firulais","Mayan Terrier","Negro",2);
        System.out.println(firu.hablar());
        Perro Lisa = new Perro("Lisa", "Pastor", "Manto negro", 3);
        int comparacion = Lisa.compareTo(firu);
        if (comparacion<0)
            System.out.println("Lisa es menor");
        if (comparacion==0)
            System.out.println("Tienen la misma edad");
        if (comparacion>0)
            System.out.println("Lisa es mayor");
    }
}