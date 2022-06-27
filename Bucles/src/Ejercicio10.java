import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.println("--------------------");
		int i=10,j=10;
	
		while (i>=1) {
			System.out.println("TABLA DEL "+i);
			System.out.println("-------------");

			while (j>=1) {
				System.out.println(i+" x "+j+" = "+i*j);
				j--;
			}
			j=10;
			i--;
			System.out.println("");
		}

	}

}
