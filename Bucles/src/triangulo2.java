import java.util.Scanner;

public class triangulo2{

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		
		System.out.println("Introduce el n�mero de filas del tri�ngulo:" );
		int fila=teclado.nextInt();
		
		for (int i=fila;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}