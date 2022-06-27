import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("ES PRIMO");
		System.out.println("--------");
		
		System.out.println("Introduce numero: ");
		int num=teclado.nextInt();
		System.out.println("--------------");
		int sum=0;
		int primo=0;
		
		for (int i=num;i>0;i--) {
			if (num%i==0){
			System.out.println(i);
			primo++;
			}
		}
		if (primo==2)System.out.println("Es primo");
		else System.out.println("No es primo");

	}

}
