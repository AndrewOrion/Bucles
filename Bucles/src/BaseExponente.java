import java.util.Scanner;

public class BaseExponente {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("BASE Y EXPONENTE");
		System.out.println("----------------");
		
		System.out.println("Introduce base: ");
		int base=teclado.nextInt();
		System.out.println("Introduce exponente: ");
		int exponente=teclado.nextInt();
		System.out.println("--------------");
		
		int res=1;

		for (int i=exponente;i>0;i--) {
			res=res*base;		
		}
		System.out.println(base+" elevado a "+exponente+" es: "+res);
		

	}

}
