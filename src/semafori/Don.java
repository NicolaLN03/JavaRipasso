//Lunardelli Nicola 5^B IA
package semafori;
import java.util.concurrent.Semaphore;

public class Don implements Runnable {

	private Semaphore s2;
	private Semaphore s3;
	
	public Don(Semaphore s2, Semaphore s3)
	{
		this.s2=s2;
		this.s3=s3;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				s2.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Don");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s3.release();
		}

	}

}