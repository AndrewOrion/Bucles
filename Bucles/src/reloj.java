import java.util.concurrent.TimeUnit;

public class reloj {

	public static void main(String[] args) throws InterruptedException {
		
		String borrar="\b\b\b\b\b\b\b\b\b\b";
		for (int horas=0;horas<24;horas++) {
			for (int minutos=0;minutos<60;minutos++) {
				for (int segundos=0;segundos<60;segundos++) {
					System.out.println(horas+":"+minutos+":"+segundos);
					TimeUnit.MILLISECONDS.sleep(100);
					System.out.print(borrar);
				}
			}
		}

	}

}
