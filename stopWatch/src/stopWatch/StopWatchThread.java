package stopWatch;

public class StopWatchThread extends Thread{
	
	public volatile boolean stoped=false;
	public volatile boolean paused=false;
	
	public void run() {
		int count=0;
		while(!stoped) {
			if(paused) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				paused=false;
			}
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println(count);
		}
		
	
	}

}
