import PoweredButton.ImageCapturingDevice;
import VideoRecorder.VideoRecorder;

public class PowerButtonVideoRecorderAdapter implements ImageCapturingDevice{
	
	private VideoRecorder videorec;
	
	 public PowerButtonVideoRecorderAdapter(VideoRecorder videorec) {
		this.videorec=videorec;
	}

	@Override
	public String takeImage() {
		
		return videorec.takeImage();
	}
	

}
