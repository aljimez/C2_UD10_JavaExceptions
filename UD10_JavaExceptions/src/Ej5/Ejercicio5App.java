package Ej5;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio5App {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el tamaño del array de passwords");
    int tamaño = sc.nextInt();
    String[] passwords = new String[tamaño];
    Password pass = new Password();    
    System.out.println("Introduce el tamaño de los passwords");
    int tamañopass = sc.nextInt();
    pass.setLongitud(tamañopass);

    Boolean[] arrF= new Boolean[tamaño];
    for (int i=0;i<passwords.length;i++){
    passwords[i] = pass.getContraseña();
    if(Password.esFuerte(passwords[i])){
    arrF[i] = Password.esFuerte(passwords[i]);
    }else arrF[i] = Password.esFuerte(passwords[i]);    
    System.out.println(passwords[i]+""+arrF[i]);
   }
   }
   
}
