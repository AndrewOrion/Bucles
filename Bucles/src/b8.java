import java.util.Scanner;

public class b8 {

	public static void main(String[] args) {
		
			Scanner teclado= new Scanner(System.in);
			System.out.println("SUMA DE LOS CENTRALES");
			System.out.println("---------------------");
			
			int res1=0,res2=0;
			System.out.println("Introduce número 1:");
			int num1=teclado.nextInt();
			System.out.println("Introduce número 2:");
			int num2=teclado.nextInt();
			
			while(num1 > 0 && num2 > 0) {
					
				res1 = res1 + num1 % 10;
				num1 = num1 / 10;
				
				res2 = res2 + num2 %10;
				num2 = num2 /10;
				
				}
			}		
			
			System.out.println("La suma es: " + res1);
			System.out.println();
			System.out.println("La suma es: " + res2);
			System.out.println();			
	}
}

