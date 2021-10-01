//Lunardelli Nicola 5^B IA
package semafori;
import java.util.concurrent.Semaphore;

public class Din implements Runnable {

	private Semaphore s1;
	private Semaphore s2;
	
	public Din(Semaphore s1, Semaphore s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			try {
				s1.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Din");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s2.release();
		}
	}

}