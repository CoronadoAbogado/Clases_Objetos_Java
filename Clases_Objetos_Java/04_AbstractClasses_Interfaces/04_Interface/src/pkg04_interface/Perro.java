package pkg04_interface;
public class Perro extends Animal {



   
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("Guau guau");
    }
    
}
