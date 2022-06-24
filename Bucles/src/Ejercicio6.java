import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("FACTORIAL");
		System.out.println("---------");
		
		System.out.println("Introduce numero: ");
		int num=teclado.nextInt();
		System.out.println("--------------------");
		
		int factorial=1;
		for (int i=num;i>0;i--) {
			factorial = factorial * i;
			System.out.println(i+" * ");
		}
		System.out.println("---------");
		System.out.println(factorial);

	}

}
