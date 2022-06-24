import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
			Scanner teclado= new Scanner(System.in);
			System.out.println("SUMA N NÚMEROS");
			System.out.println("--------------");
			
			System.out.println("Introduce numero: ");
			int num=teclado.nextInt();
			System.out.println("--------------------");
			
			int suma=0;
			for (int i=num;i>0;i--) {
				suma = suma + i;
				System.out.println(i+" + ");
			}
			System.out.println("---------");
			System.out.println(suma);
		}
	}