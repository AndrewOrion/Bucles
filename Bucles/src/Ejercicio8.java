import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("DIVISORES");
		System.out.println("---------");
		
		System.out.println("Introduce numero: ");
		int num=teclado.nextInt();
		System.out.println("_________________");
	

		for (int i=num;i>0;i--) {
			if (num%i==0)
			System.out.println(i);
		}

	}

}
