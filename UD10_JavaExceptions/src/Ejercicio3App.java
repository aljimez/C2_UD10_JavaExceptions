import java.util.Random;
public class Ejercicio3App {
	public static void main(String[] args) {
    
    
    }
    public static int GenNUmero() {
        Random rnd = new Random();
        System.out.println("Generando numero aleatorio");
        int rnum = rnd.nextInt(100);
       return rnum;
    }
    try {
        if ( GenNUmero()% 2 == 0) {
            System.out.println("El numero aleatorio generado: "+GenNUmero());
            System.out.println("el numero generado es par");
        }else System.out.println("el numero generado es impar");
    }catch(ArithmeticException a){
        System.out.println("No ha sido posible hacer la comprovación");
    }

}

