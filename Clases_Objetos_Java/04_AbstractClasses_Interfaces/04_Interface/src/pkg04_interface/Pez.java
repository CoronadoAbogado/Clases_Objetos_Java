package pkg04_interface;
public class Pez extends Animal implements Nadador{
 public Pez(String nombre, int edad){
        super( nombre,  edad);
    }
    @Override
    void hacerSonido() {
        System.out.println("Glu glu");
    }

    @Override
    public void nadar() {
        System.out.println("fish.swim");
    }
    
}
