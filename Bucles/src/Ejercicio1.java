import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("TABLA MULTIPLICAR");
		System.out.println("--------------------");
		
		System.out.println("Introduce un numero: ");
		int num=teclado.nextInt();
		
		for (int i=1;i<=10;i++) {
			System.out.println(num + " x "+i+" = "+num*i);
		}

	}

}
