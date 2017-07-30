package primethreaddemo;

public class PrimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Both method invoke start to Start the new Thread
		new PrimeThread().start();
		
		PrimeRun primerun=new PrimeRun();
		Thread th=new Thread(primerun);
		th.start();
	}

}
