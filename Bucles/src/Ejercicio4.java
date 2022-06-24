import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
			Scanner teclado= new Scanner(System.in);
			System.out.println("IMPARES ENTRE DOS NÚMEROS");
			System.out.println("-------------------------");
			
			System.out.println("Introduce numero 1: ");
			int num1=teclado.nextInt();
			System.out.println("Introduce numero 2: ");
			int num2=teclado.nextInt();
			System.out.println("--------------------");
			
			int menor=num1;
			
			if (num1>num2) menor=num2;
			else num1=num2;
			
			for (int i=menor;i<=num1;i++) {
				if (i%2!=0)
				System.out.println(i);
			}

		}
	}

	
