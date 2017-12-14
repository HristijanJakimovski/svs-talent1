package fileinputstream;

import java.io.FileInputStream;

public class ByteReader {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\eclipse\\eclipse\\test.txt");
			boolean eof=false;
			int count=0;
			while(!eof) {
				int input=fis.read();
				System.out.println(input + " ");
				if(input==-1) {
					eof=true;
					
				}else {
					count++;
				}
			}
			fis.close();
			System.out.println("\nButes read:"+ count);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
