import java.util.Scanner;

public class b6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("100 números");
		System.out.println("-----------");
		
		long res=0;
		
		System.out.println("Número|Cuadrado");
		System.out.println("______|________");
		for (int i=1;i<=100;i++) {
			res=0;
			for (int j=0;j<i;j++) {
				res=res+i;
			}
			System.out.println(i+"     |       "+res);	
		}
	

	}

}
