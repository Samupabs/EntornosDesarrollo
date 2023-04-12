/**
* Escriba un programa que genere pida números por teclado y los imprima, en caso de recibir un dato que no sea un número,
* tratará la excepción producida por el Scanner y volverá a solicitar el número al usuario.
 * @author Pablo Herrera Calvo
 * @date 11/04/2022
* */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        pedirNumero();
    } // Acaba el String[]args

    public static void pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        boolean bucleUno = false;

        while (!bucleUno) {
            try {
                System.out.println("Dame un numero compañero");
                respuesta = sc.nextInt();
                bucleUno = true;
            } catch (InputMismatchException e) {
                System.err.println("Introduce un numero, no una palabra");
                sc.next();
            } //Acaba el TryCatch
        } //Acaba bucle
        System.out.println("Tu respuesta ha sido registrada: " + respuesta);
    } //Acaba pedirNumero()
} //Acaba Main