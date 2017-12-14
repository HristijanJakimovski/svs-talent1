
public class ZipCode {
	
	private String zipCode;
	
	public ZipCode(String s) {
		setZipCode(s);
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String s) {
		if(s.length()==5 || s.length()==9) {
			this.zipCode=s;
		}
		else {
			System.out.println("its not 5 or 9 digit zipcode!!!");
		}
	}

	
	public static void main(String[] args) {
			
		ZipCode zipcode=new ZipCode("12345");
		System.out.println(zipcode.getZipCode());
		

	}

}
