package dp;

public class Application {
	
	public static void main(String[] args) throws InterruptedException {
		for(int i = 1; i<=5; i++) {
			//Singleton s =  Singleton.getInstance();
			//s.traiter("T" + i);
			
			ThreadedTask t = new ThreadedTask("T" + i);
			t.start();
		}
	}

}
