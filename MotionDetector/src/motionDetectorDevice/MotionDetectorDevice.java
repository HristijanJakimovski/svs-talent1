package motionDetectorDevice;

import java.util.ArrayList;

import alarm.RingAlarm;
import imageCapture.MobilePhone;

public class MotionDetectorDevice {
	
	

	public static void main(String[] args) throws InterruptedException {
		MobilePhone mp=new MobilePhone();
		RingAlarm rg = new RingAlarm();
		
		ArrayList<String> capturedImages = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			String newImage=mp.takeImage();
			if (!capturedImages.contains(newImage)) {
				rg.setAlarm();
				capturedImages.add(newImage);
			}
			
			
			Thread.sleep(1000);
			
		}

	}

}
