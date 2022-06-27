import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("FIBONACCI");
		System.out.println("---------");
		
		
		long siguiente = 1, num = 0, temporal = 0;
		for (int i = 1; i <= 100; i++) {
			if (num<1000) {
			System.out.println(i+") "+num);
			temporal = num;
			num = siguiente;
			siguiente = siguiente + temporal;}
		}
    }
}
