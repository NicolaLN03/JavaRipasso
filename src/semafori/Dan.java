//Lunardelli Nicola 5^B IA
package semafori;
import java.util.concurrent.Semaphore;

public class Dan implements Runnable {

	private Semaphore s3;
	private Semaphore s1;
	
	public Dan(Semaphore s3, Semaphore s1)
	{
		this.s3=s3;
		this.s1=s1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				s3.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Dan");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s1.release();
		}
	}
}
