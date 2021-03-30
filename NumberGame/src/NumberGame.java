import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("Try guess a number between 1 and 100.");
        System.out.println("Enter your guess: ");
        Scanner scanner = new Scanner(System.in);

        for(int i=10; i>0; i--){
            System.out.println("You have "+i+" times left to guess");
            int guess = scanner.nextInt();
            if (guess > randomNumber){
                System.out.println("Your number is bigger than the target number. Try again.");
            }
            else if (guess < randomNumber){
                System.out.println("Your number is smaller than the target number. Try again.");
            }
            else{
                hasWon = true;
                break;
            }
        }
        if (hasWon){
            System.out.println("CORRECT... YOU WIN!");
        }
        else {
            System.out.println("GAME OVER. YOU LOSE. The correct number is "+ randomNumber);
        }
    }
}
