import java.util.*;
import java.lang.Math;

public class Number_Game{

	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 100) + 1;

		Scanner sc = new Scanner(System.in);
		boolean guessflag = false;
		int numberOfAttempts = 0;
		
		System.out.println("Guess a number between 1 and 100: ");
		System.out.println("NOTE: You have only 5 guesses to win..!");

		while (!guessflag && numberOfAttempts < 5){
		    
		    int Guessednumber = sc.nextInt();

		    if (Guessednumber == randomNumber){
		        guessflag = true;
		    } 
		    else{
		        numberOfAttempts++;
		        if(Guessednumber > randomNumber){
		            System.out.println("Your guess is too high.");
		        }
				else{
		            System.out.println("Your guess is too low.");
		        }
		    }
		}

		if (guessflag){
		    System.out.println("Congratulations!...Your guess is correct! The number was " + randomNumber);
		}
		else{
		    System.out.println("Sorry, you ran out of guesses. The System generated number was " + randomNumber);
		}
	}
}