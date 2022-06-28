import java.util.Scanner;

public class b7 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("_________________");
		System.out.println("|SUMA DE DÍGITOS|");
		System.out.println("|_______________|");
		System.out.println();
		
		//int num=1;
		int salir =1;
		
		do {
			System.out.println("Introduce número para sumar dígitos:");
			System.out.println("Si desea salir teclee 'exit'");
			System.out.println();
			String op=teclado.next();
		
			if (!op.equals("exit")) {
				long sum=0;
				long res=0;
				int num= Integer.parseInt (op);//convierto string en int
				
				while(num > 0) {
					res = res + num % 10;
					num = num / 10;
				}

			System.out.println("La suma es: " + res);
			System.out.println();
			}
			else salir=0;
		
		}while (salir==1);
		System.out.println("ADIOS");
		
	}
}
