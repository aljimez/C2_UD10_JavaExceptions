import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1App {
	
	public static void main(String[] args) {
	
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		String input = sc.nextLine();		
		} catch (InputMismatchException e){
			System.out.println("El dato introducido no es un numero");
			
		}catch (Exception mensaje){
			System.out.println(mensaje.getMessage());
		}
	}
	public static int Randgen() {
	Random rnd = new Random();
	int aleat = rnd.nextInt(499);
	return aleat;
}
public static String  CheckRes(int input) {
	String mensaje = "";
	int i = 0;
	if(Randgen() < input){
mensaje ="El numero introducido es mayor al generado";
i++;
	}else if(Randgen() > input){
i++;
mensaje = "El numero introducido es menor al generado";

	}else mensaje ="El numero introducido es igual al generado, lo has intentado "+i+"Veces";

	return mensaje;
}


}


