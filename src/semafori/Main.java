//Lunardelli Nicola 5^B IA
package semafori;
import java.util.concurrent.Semaphore;

public class Main {

	public static Semaphore s1= new Semaphore(1);
	public static Semaphore s2= new Semaphore(0);
	public static Semaphore s3= new Semaphore(0);
	
	public static void main(String[] args) {
		Thread din= new Thread(new Din(s1,s2));
		Thread don= new Thread(new Don(s2,s3));
		Thread dan= new Thread(new Dan(s3,s1));
		
		din.start();
		don.start();
		dan.start();
	}

}
