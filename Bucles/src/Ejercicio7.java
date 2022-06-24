import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("MÚLTIPLOS DE 7");
		System.out.println("--------------");
		
		System.out.println("Introduce numero 1: ");
		int num1=teclado.nextInt();
		System.out.println("Introduce numero 2: ");
		int num2=teclado.nextInt();
		System.out.println("--------------------");
		
		int menor=num1;
		
		if (num1>num2) menor=num2; // controlo que num1 sea el mayor siempre
		else num1=num2;

		for (int i=num1;i>=menor;i--) {
			if (i%7==0)
			System.out.println(i);
		}
	}

}
