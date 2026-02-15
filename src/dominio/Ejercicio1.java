package dominio;

// Ejercicio: 1. Implementar una función recursiva que cuente cuántas veces
// aparece un dígito en un número.

public class Ejercicio1 {

    public static int contarDigito(int numero, int digito){
        if (numero == 0)
            if (digito == 0)
                return 1;
            else
                return 0;
        else{
            if (numero % 10 == digito){
                return 1 + contarDigito(numero/10, digito);
            }else
                return 0 + contarDigito(numero/10, digito);
        }
    }
}

