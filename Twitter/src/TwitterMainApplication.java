import java.util.Scanner;

import com.twitter.application.TwitterApplication;

public class TwitterMainApplication {

	public static void main(String[] args) {
		
		TwitterApplication twitterApplication= new TwitterApplication();
		while(true) {
		System.out.println("1. tweet message");
		System.out.println("2. list messages");
		System.out.println("3. exit");
		System.out.println("Enter your choice: ");
		
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		
		switch(choice) {
		case 1:
		System.out.println("insert your tweet: ");
		Scanner input2=new Scanner(System.in);
		String message=input2.nextLine();
		twitterApplication.tweetMessage(message);
		break;
		case 2:
			twitterApplication.listMessages();
			break;
		case 3:
			System.exit(0);
		}
		
		}
		

	}

}
