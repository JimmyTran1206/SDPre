import java.util.Scanner;

public class Objective4Lab1{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);

		String fname="";
		String lname = "";
    	String favoriteAnimal = "";
    	String favoriteFood = "";
    	String favoriteSong = "";

    	System.out.println("What is your first name?");
    	fname= keyboard.nextLine();
    	System.out.println("What is your last name?");
    	lname= keyboard.nextLine();
    	System.out.println("What is your favorite animal?");
    	favoriteAnimal= keyboard.nextLine();
    	System.out.println("What is your favorite food?");
    	favoriteFood= keyboard.nextLine();
    	System.out.println("What is your favorite song?");
    	favoriteSong= keyboard.nextLine();


    	System.out.printf("Your name is %s %s%n", fname, lname);
    	System.out.println("Your favorite animal is " + favoriteAnimal);
    	System.out.println("Your favorite food is " + favoriteFood);
    	System.out.println("Your favorite song is " + favoriteSong);
    	
    	keyboard.close();

	}
}