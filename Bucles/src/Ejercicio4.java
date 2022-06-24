import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
			Scanner teclado= new Scanner(System.in);
			System.out.println("IMPARES");
			System.out.println("--------");
			
			System.out.println("Introduce numero 1: ");
			int num1=teclado.nextInt();
			System.out.println("Introduce numero 2: ");
			int num2=teclado.nextInt();
			
			int num3=num1;
			
			if (num1>num2) num3=num2;
			for (int i=num3;i<=num1;i++) {
				if (i%2!=0)
				System.out.println(i);
			}

		}
	}

	
