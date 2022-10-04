package inv;

import java.util.Scanner;

public class InversorDeTexto {
    public static void main(String [] args){
        String Texto;
        StringBuilder TextoInvertido = new StringBuilder();
        int NumeroPalabras;
        Scanner entrada= new Scanner (System.in);
        System.out.print("Ingrese el texto a invertir: ");
        Texto= entrada.nextLine();
        NumeroPalabras=Texto.length();
        while(NumeroPalabras!=0){
            TextoInvertido.append(Texto.charAt(NumeroPalabras - 1));
            NumeroPalabras--;
        }
        System.out.println("El texto invertido es: "+TextoInvertido);

    }
}

