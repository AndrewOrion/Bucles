import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("PERFECTO");
		System.out.println("--------");
		
		System.out.println("Introduce numero: ");
		int num=teclado.nextInt();
		System.out.println("--------------");
		int sum=0;

		for (int i=num-1;i>0;i--) {
			if (num%i==0){
			System.out.println(i);
			sum=sum+i;
			}
		}
		System.out.println("La suma de sus divisores es: "+sum);
		System.out.println("_____________");
		if (sum==num)System.out.println("Es perfecto");
		else System.out.println("No es perfecto");
	}
}
