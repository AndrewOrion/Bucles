import java.util.Scanner;

public class menor {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("MENOR N�MERO");
		System.out.println("____________");
		
		int menor=Integer.MAX_VALUE; //m�ximo entero
		
		for(int i =0;i<10;i++) {
			System.out.printf("Introduce el n�mero %d:",i);
			int num=teclado.nextInt();
			if (num<menor) {
				menor=num;
			}
		}
		System.out.println("El menor es: "+menor);
	}
}