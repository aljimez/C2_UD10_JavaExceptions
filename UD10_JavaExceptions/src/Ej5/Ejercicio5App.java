package Ej5;
import java.util.Scanner;
public class Ejercicio5App {
   public static void main(String[] args) {
    //Solicitamos los datos necesarios y los asignamos a una array en caso de ser necesario
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el tamaño del array de passwords");
    int tamaño = sc.nextInt();
    String[] passwords = new String[tamaño];
    Password pass = new Password();    
    System.out.println("Introduce el tamaño de los passwords");
    int tamañopass = sc.nextInt();
    pass.setLongitud(tamañopass);
    Boolean[] arrF= new Boolean[tamaño];
    //Asignación y muestra de los valores traidos desde la clase Password
    for (int i=0;i<passwords.length;i++){
    passwords[i] = pass.getContraseña();
    if(Password.esFuerte(passwords[i])){
    arrF[i] = Password.esFuerte(passwords[i]);
    }else arrF[i] = Password.esFuerte(passwords[i]);    
    System.out.println(passwords[i]+""+arrF[i]);
   }
   }
   
}
