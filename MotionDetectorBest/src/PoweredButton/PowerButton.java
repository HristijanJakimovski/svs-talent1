package PoweredButton;

public class PowerButton{
	
	
	private ImageCapturingDevice imgcapdev;
	
	public PowerButton(ImageCapturingDevice imgcapdev) {
		this.imgcapdev=imgcapdev;
	}

		
		public String start() {
			
			return imgcapdev.takeImage();
			
		}


	
	
	

}
