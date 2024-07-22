public class Principal{
    public static void main(String[] args){
        Perro miPerra1;//declarando la variable
        System.out.println("Mis Perros");
        miPerra1 = new Perro();
        Perro miPerra2 = new Perro();

    if (miPerra1.equals(miPerra2))
        System.out.println("Son iguales");
    else
        System.out.println("No Son iguales");

        System.out.println("Mi perra 1");
        System.out.println(miPerra1.toString());
        System.out.println("Mi perra 2");
        System.out.println(miPerra2.toString());
        System.out.println("\nCambiando mi perro 1\n=====================\n");
        miPerra1.setNombre("Laika");
        miPerra1.setRaza("Labrador");
        miPerra1.setEdad(10);
        miPerra1.setSexo(true);
        miPerra1.setPeso(50);
        miPerra1.setTamanio("mediano");
        miPerra1.setColor("negro");
        System.out.println(miPerra1);
        System.out.println("\nCambiando mi perro 2\n=====================\n");
        miPerra2.setNombre("Lisa");
        miPerra2.setRaza("Pastor Alemán");
        miPerra2.setEdad(2);
        miPerra2.setSexo(true);
        miPerra2.setPeso(70);
        miPerra2.setTamanio("grande");
        miPerra2.setColor("manto negro");
        System.out.println(miPerra2);
        
        if (miPerra1 == miPerra2)
            System.out.println("Son iguales");
        else
            System.out.println("No Son iguales");

        //Alias
        System.out.println("Creando el alias ");
        System.out.println("\n=====================\n");
        miPerra1 = miPerra2;
        System.out.println(miPerra1);
        System.out.println("\n=====================\n");
        
        System.out.println("Cambiar Perra 2 ");
        miPerra2.setNombre("Otro nombre cualquiera");
        System.out.println("Imprimiendo Perra 1");
        System.out.println(miPerra1);
        System.out.println("\n=====================\n");
        if (miPerra1 == miPerra2)
            System.out.println("Son iguales");
        else
            System.out.println("No Son iguales");
    }

    

}