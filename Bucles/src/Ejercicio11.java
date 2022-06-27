import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.println("--------------------");
		int i=10,j=10;
	
			do {
			System.out.println("TABLA DEL "+i);
			System.out.println("-------------");

			do {
				System.out.println(i+" x "+j+" = "+i*j);
				j--;
			} while(j>=1);
			j=10;
			i--;
			System.out.println("");
			}while (i>=1);
		


	}

}
