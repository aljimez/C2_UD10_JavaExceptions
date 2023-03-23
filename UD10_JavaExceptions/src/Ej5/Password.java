package Ej5;
import java.util.Random;
public class Password {
    int longitud = 0;
    String contraseña = "";
    public Password() {   

    }
    //Construcción de los setters y getters
    public void setLongitud (int longitud){

        this.longitud = longitud;

    }
    public int getLongitud (){

        return longitud;
    }

    
    public String getContraseña(){

        return contraseña;
    }
    //Generar una contraseña
    public static void generarPassword(Password pass) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i <pass.getLongitud() ; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
    }

//Comprobación de la fortaleza de una contraseña
    public static boolean esFuerte(String contraseña){
        boolean res = true;
for (int i = 0; i < contraseña.length(); i++) {
    int small = 0;  int big = 0; int num = 0;
        if (contraseña.charAt(i)<='z'&& contraseña.charAt(i)>='a') {
        small++;
        }
        if (contraseña.charAt(i)<='Z'&& contraseña.charAt(i)>='A') {
            big++;
        }
    
        if (contraseña.charAt(i)<='0'&& contraseña.charAt(i)>='9') {
            big++;
        }
        if (small > 1 && big > 2 && num > 5) {
             res = true;
        }else res = false;
}
return res;
    }

   

}
    


