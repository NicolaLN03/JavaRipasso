package ripasso;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Inserisci T-min: ");
		int min=s.nextInt();
		System.out.println("Inserisci T-max: ");
		int max=s.nextInt();
		
		// The Traditional Long way:
		Task2 j2=new Task2(min, max);
		Thread t2= new Thread(j2);
		t2.start();
		
		Task j= new Task();
		Thread t= new Thread(j);
		t.start();
		
		
		
		//oggetti anonimi:
		new Thread(new Task()).start();
		
	}

}
