package stopWatch;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		StopWatchThread thr=new StopWatchThread();
		
		thr.start();
		Thread.sleep(10000);
		thr.paused=true;
		Thread.sleep(10000);
		thr.stoped=true;
	}

}
