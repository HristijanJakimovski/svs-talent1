package wordcounter2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class countWords {

	public static void main(String[] args) throws IOException {
		
		String[] words;
		Hashtable<String, Integer> hash=new Hashtable<>();
		int counter;
		FileReader fr=null;
		try {
			 fr=new FileReader("test.txt");
			BufferedReader br=new BufferedReader(fr);
			boolean num=false;
			while(!num) {
				String line= br.readLine();
				if(line==null) {
					num=true;
				}
				else {
					words=line.split(" ");
					for(String word:words) {
						if(hash.containsKey(word)) {
							counter=hash.get(word);
							counter++;
							hash.put(word, counter);
						}
						else {
							hash.put(word, 1);
						}
					}
				}
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			fr.close();
		}
		for(Object key : hash.keySet()) {
			System.out.println(key+ " "+ hash.get(key));
		}

	}

}
