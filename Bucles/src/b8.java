import java.util.Scanner;

public class b8 {

	public static void main(String[] args) {
		
			Scanner teclado= new Scanner(System.in);
			System.out.println("SUMA DE LOS CENTRALES");
			System.out.println("---------------------");
			
			int res1=0,res2=0;
			System.out.println("Introduce número 1 (4 cifras):");
			int num1=teclado.nextInt();
			System.out.println("Introduce número 2 (4 cifras):");
			int num2=teclado.nextInt();
			int a;
			num1=num1%1000;
			num2=num2%1000;
			
			int temporal1=num1;
			int temporal2=num2;
			
			while(num1 > 0 && num2 > 0) {	
				if (num1!=temporal1 && num2!=temporal2) {
					res1 = res1 + num1 % 10;
					res2 = res2 + num2 %10;
				}
				num1 =num1/10;
				//System.out.println("num1: "+num1);
				num2=num2/10;
				//System.out.println("num2: "+num2);
			}
			System.out.println("_________________________");
			System.out.println();
			if (res1==res2)
				System.out.println("Las sumas centrales (" + res1+ " y "+res2+
					") son iguales");
			else
				System.out.println("Las sumas centrales " + res1+ " y "+res2+
						" son distintas");
	}
}

