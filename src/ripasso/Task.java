package ripasso;
public class Task implements Runnable {

	boolean Run;
	int n;
	
	public Task()
	{
		this.Run=true;
	}
	
	public void Stop()
	{
		this.Run=false;
		this.n=0;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			System.out.println("Thread A: " +n++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
