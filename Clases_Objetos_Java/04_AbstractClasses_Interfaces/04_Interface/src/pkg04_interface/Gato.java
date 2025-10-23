package pkg04_interface;
public class Gato extends Animal {

    public Gato(String nombre, int edad){
        super( nombre,  edad);
    }
    @Override
    void hacerSonido() {
        System.out.println("Miau miau");
    }
    
}
