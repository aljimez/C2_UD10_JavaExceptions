package Ej5;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio5App {
   public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el tamaño del array de passwords");
int tamaño = sc.nextInt();
String[] passwords = new String[tamaño];
Password pass = new Password();    
    System.out.println("Introduce el tamaño de los passwords");
     int tamañopass = sc.nextInt();
    passwords = new String[tamañopass];
    for (int i=0;i<passwords.length;i++){
      passwords[i] = pass.getContraseña();
  }

  Boolean[] arrF= new Boolean[tamaño];
  for (int i = 0; i < arrF.length; i++) {
      arrF[i]=pass.esFuerte(passwords[i]);
  System.out.println(arrF[i]+""+arrF[i]);
   }
    }



}