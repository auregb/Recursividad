package dominio;
public class Mates {

// funcion factorial sin memoria recursiva
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
