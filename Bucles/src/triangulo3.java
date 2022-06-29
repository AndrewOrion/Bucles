import java.util.Scanner;

public class triangulo3{

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("    -");
		System.out.println("   ---");
		System.out.println("  -----");
		System.out.println(" --------");
		System.out.println(" PIRÁMIDE");
		System.out.println("_________");
		
		System.out.println("Introduce el número de filas de la pirámide:" );
		int fila=teclado.nextInt();
		
		for (int i=1;i<=fila;i++) {
			for (int j=1;j<=fila-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}