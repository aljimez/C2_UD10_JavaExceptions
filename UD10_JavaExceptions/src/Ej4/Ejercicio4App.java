package Ej4;
import java.util.Scanner;
import java.lang.Math;
import java.lang.ArithmeticException;
public class Ejercicio4App {
	public static void main(String[] args) {
        int res = 0;
        double rres= 0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el calculo que quieres hacer");
        String input = sc.nextLine();	

        System.out.println("Introduce el primer numero a calcular");
        int n1 = sc.nextInt();	

        System.out.println("Introduce el segundo numero a calcular");
        int n2 = sc.nextInt();
        try{  	
    switch (input) {
    case "suma":
    res = n1 + n2;
    break;
    case "resta":
    res = n1 - n2;
    break;
    case "multiplicación":
    res = n1*n2;
    break;
    case "potencia":
    res = n1 ^n2;
    break;
    case "raiz cuadrada":
    rres = Math.sqrt(n1);
    break;
    case "raíz cubica":
    rres = Math.cbrt(n1);
    break;
    case "división":
    res = n1/n2;
    break;
        }
    }catch(ArithmeticException a){

    System.out.println("Los calculos no han sido hechos correctamente");

    }
    }
}