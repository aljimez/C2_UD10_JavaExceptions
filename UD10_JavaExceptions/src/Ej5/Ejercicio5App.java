package Ej5;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio5App {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el tamaño del array de passwords");
int tamaño = sc.nextInt();
int[] passwords = new int[tamaño];

Password pass = new Password(0);    
   // Password[] passwords = new Password[](tamaño);
    System.out.println("Introduce el tamaño de los passwords");
     int tamañopass = sc.nextInt();
    for (int i = 0; i < passwords.length; i++) {
       passwords[i] = Password pass = new Password(tamañopass);    

    }
    }


}