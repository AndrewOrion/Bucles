import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("RESTAS SUCESIVAS");
		System.out.println("----------------");
		
		System.out.println("Introduce dividendo: ");
		int dividendo=teclado.nextInt();
		System.out.println("Introduce divisor: ");
		int divisor=teclado.nextInt();
		System.out.println("--------------------");

		int cociente = 0;
        int resto = dividendo;

        while ( resto >= divisor )
        {
            resto = resto-divisor;// resto el divisor porque voy repartiendo de ese num en ese num
            cociente++;
        }

        System.out.printf( "\n   %d |___%d = %d (Resto = %d)", dividendo, divisor, cociente, resto );
    
	}

}
