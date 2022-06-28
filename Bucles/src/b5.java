import java.util.Scanner;

public class b5 {

		public static void main(String[] args) {
			Scanner teclado= new Scanner(System.in);
			System.out.println("1 AL 20 FACTORIAL");
			System.out.println("------------------");
			
			long sum=0;
			long fact=1;
			
			for (int i=1;i<=20;i++) {
				System.out.println("Número: "+i+": ");	
				
				for (int j=i;j>0;j--) {
					fact= fact * j;		
				}
				
				sum=sum+fact;
				
				System.out.println("Factorial de "+i+" es "+fact);
				System.out.println("Sumatorio de factoriales acumulado: "+sum);
				System.out.println("______________");
			
				fact=1;				
			}
	}
}
