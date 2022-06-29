import java.util.Scanner;

public class triangulo1{

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce el número de filas del triángulo:" );
		int fila=teclado.nextInt();
		
		for (int i=1;i<=fila;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}