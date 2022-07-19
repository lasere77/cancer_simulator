package fr.lasere.cancer_simulator.Thread;

public class TimeThread extends Thread{
	
	private int time;
	@SuppressWarnings("unused")
	private boolean running = true;
	
	public void run() {
		System.out.println("ThreadTime launch !!!");
		try {
			time();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	public int time() throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			time = time + 1;
			System.out.println("the simulation was launched ago : " + time + " sec");
		}
	}


	public int getTime() {
		System.out.println(time);
		return time;
	}
}
