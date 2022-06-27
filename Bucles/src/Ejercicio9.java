import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.println("--------------------");
		int i=10,j=10;
	
		for (i=10;i>=1;i--) {
			System.out.println("TABLA DEL "+i);
			System.out.println("-------------");

			for (j=10;j>=1;j--) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println("");
		}

	}

}
