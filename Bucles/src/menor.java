import java.util.Scanner;

public class menor {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("MENOR NÜMERO");
		System.out.println("____________");
		
		int menor=Integer.MAX_VALUE; //máximo entero
		
		for(int i =0;i<10;i++) {
			System.out.printf("Introduce el número %d:",i);
			int num=teclado.nextInt();
			if (num<menor) {
				menor=num;
			}
		}
		System.out.println("El menor es: "+menor);
	}
}