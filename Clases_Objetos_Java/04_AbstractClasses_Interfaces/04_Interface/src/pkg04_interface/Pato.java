package pkg04_interface;
public class Pato extends Animal implements Nadador,Volador {
 public Pato(String nombre, int edad){
        super( nombre,  edad);
    }
    @Override
    void hacerSonido() {
        System.out.println("Cuac cuac");
    }

    @Override
    public void nadar() {
        System.out.println("Pato.swim");
    }

    @Override
    public void volar() {
        System.out.println("Pato.fly");
    }
    
}
