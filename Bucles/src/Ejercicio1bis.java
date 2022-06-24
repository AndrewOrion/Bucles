import java.util.Scanner;

public class Ejercicio1bis {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("TABLA MULTIPLICAR");
		System.out.println("--------------------");
		
		int num=0; 
		
		do {
			System.out.println("Introduce un numero de 1 al 10: ");
			num=teclado.nextInt();
		} while (num<1 || num>10);
		
		for (int i=1;i<=10;i++) {
			System.out.println(num + " x "+i+" = "+num*i);
		}

	}

}
