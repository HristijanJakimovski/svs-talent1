import Camera.Camera;
import PoweredButton.ImageCapturingDevice;

public class PowerButtonCameraAdapter implements ImageCapturingDevice{
	
	private Camera camera;
	
	public PowerButtonCameraAdapter(Camera camera) {
		this.camera=camera;
	}

	@Override
	public String takeImage() {
		return camera.takeImage();
	}

}
