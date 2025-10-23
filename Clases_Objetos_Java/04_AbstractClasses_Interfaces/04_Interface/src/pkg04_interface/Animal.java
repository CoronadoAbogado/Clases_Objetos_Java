package pkg04_interface;
abstract public class Animal {
  private  String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
    }
    
    void comer(){
        System.out.println("Animal.eat");
    }
 abstract void hacerSonido();
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + "- edad=" + edad + '}';
    }
    
}
