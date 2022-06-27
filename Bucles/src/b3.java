import java.util.Scanner;

public class b3 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("INVERSO");
		System.out.println("-------");
		
		System.out.println("Introduce número: ");
		float num=teclado.nextFloat();
		double res=0;
		System.out.println("--------------------");
		
		res=1/num;
		res=Math.round(res*100.0)/100.0;
        System.out.println( "El inverso de "+num+" es: "+ res );
    
	}

}
