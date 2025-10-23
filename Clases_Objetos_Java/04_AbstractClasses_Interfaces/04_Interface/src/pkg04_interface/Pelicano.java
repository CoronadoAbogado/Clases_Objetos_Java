package pkg04_interface;
public class Pelicano extends Animal implements Volador{
 public Pelicano(String nombre, int edad){
        super( nombre,  edad);
    }
    @Override
    void hacerSonido() {
        System.out.println("Croar croar");
    }

    @Override
    public void volar() {
        System.out.println("Pelicano.fly");
    }
    
}
