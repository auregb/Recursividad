package aplicacion;
import dominio.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("factorial(5) = "+Mates.factorial(5));

        //System.out.println("contarDigito(556, 5) = "+Ejercicio1.contarDigito(556, 5));

        //System.out.println();

        if(Laberinto.buscar(1,1)){
            Laberinto.mostrarLaberinto();
        }
        else{
            System.out.println("No se ha encontrado la salida del laberinto.");
        }

    }
}
