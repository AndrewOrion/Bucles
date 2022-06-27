import java.util.Scanner;

public class b4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("100 números");
		System.out.println("-----------");
		
		int sum=0;
		System.out.println("Número|Cuadrado|Sumatorio");
		System.out.println("______|________|_________");
		for (int i=1;i<=100;i++) {
			sum=sum+i;
			System.out.println(i+"     |       "+i*i+"|"+sum);	
		}
	
	}

}
