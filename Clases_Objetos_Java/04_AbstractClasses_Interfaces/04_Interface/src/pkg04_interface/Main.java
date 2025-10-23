package pkg04_interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal[] Animals = new Animal[5];
        Perro dog1 = new Perro("Sergio", 2);
        Gato cat1 = new Gato("Manolo", 10);
        Pelicano pelicano1 = new Pelicano("Juan", 5);
        Pez fish1 = new Pez("Cerveza", 1);
        Pato pato1 = new Pato("Pepe", 7);

        Animals[0] = dog1;
        Animals[1] = cat1;
        Animals[2] = pelicano1;
        Animals[3] = fish1;
        Animals[4] = pato1;
        for (int i = 0; i < Animals.length; i++) {
            System.out.println("________________");
            System.out.println(Animals[i]);
            Animals[i].hacerSonido();
            
        }

    }
}
