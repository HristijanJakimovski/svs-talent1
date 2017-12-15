package imageCapture;

import java.util.Scanner;

public class MobilePhone implements ImageCapturingDevice{

	@Override
	public String takeImage() {
		Scanner input = new Scanner(System.in);
		
		return input.nextLine();
		
	}

}
