package Ej5;
import java.util.Random;
public class Password {
	
    int longitud = 0;
String contraseña = "";
    public Password(int longitud) {   

    }

    public int getLongitud (){

        return longitud;
    }

    public void setLongitud (){

        this.longitud = longitud;

    }
    public String getContraseña(){

        return contraseña;
    }

    public static boolean esFuerte(String contraseña){
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
            return true;
        }else return false;
}
    return false;
    }

    public static void generarPassword(int longitud) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < longitud; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));

        }
    }

}
    


