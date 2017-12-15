import java.util.ArrayList;

import Alarm.ringAlarm;
import Camera.Camera;
import PoweredButton.PowerButton;
import VideoRecorder.VideoRecorder;

public class MotionDetectorApplication {

	public static void main(String[] args) throws InterruptedException {
	
		ringAlarm rg=new ringAlarm();
		Camera cam=new Camera();
		PowerButton cameraButton=new PowerButton(new PowerButtonCameraAdapter(cam));
		
		ArrayList<String> capturedImages= new ArrayList<>();
		for(int i=0;i<10;i++) {
			String newImage=cameraButton.start();
			if (!capturedImages.contains(newImage)) {
				rg.ringAlarm();
				capturedImages.add(newImage);
			}
			
			
			Thread.sleep(1000);
			
		}
		
		VideoRecorder vidrec=new VideoRecorder();
		PowerButton videorecButton=new PowerButton(new PowerButtonVideoRecorderAdapter(vidrec));
		
		for(int i=0;i<10;i++) {
			String newVideoImage=videorecButton.start();
			if (!capturedImages.contains(newVideoImage)) {
				rg.ringAlarm();
				capturedImages.add(newVideoImage);
			}
			
			
			Thread.sleep(1000);
			
		}
		
		
		
		
				

	}

}
