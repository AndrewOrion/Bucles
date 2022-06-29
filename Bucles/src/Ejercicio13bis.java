import java.util.Scanner;

public class Ejercicio13bis {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("ES PRIMO");
		System.out.println("--------");
		
		System.out.println("Introduce numero: ");
		int num=teclado.nextInt();
		System.out.println("--------------");
		
		boolean primo=true;
		
		for (int i=2;i<num;i++) {
			if (num%i==0){
			primo=false;
			}
		}
		if (primo)
			System.out.println("Es primo");
		else 
			System.out.println("No es primo");

	}
}
