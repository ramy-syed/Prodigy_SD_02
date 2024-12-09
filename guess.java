import java.util.*;
class Game
{
    public static void main(String args[])
    {
        int n, guess, g, d;
        Scanner sc=new Scanner(System.in);
        System.out.println("    ** WELCOME TO THE GUESSING GAME **\n");
        n=6; //ORIGINAL NUMBER
        System.out.println("Enter your guess (between 1 to 10): ");
        guess=sc.nextInt();
        while(guess==n || guess>n || guess<n)
        {
            if (guess==n)
            {
                System.out.println("WOW! Your guess is absolutely correct, the number was 6");
                break;
            }
            else if(guess>n)
            {
                d=guess-n;
                if(d>2)
                    System.out.println("Uh-oh! WRONG GUESS \n Your guess is MUCH higher than the original number :( \n Better luck, next time! ");
                else 
                    System.out.println("Uh-oh! WRONG GUESS \n Your guess is a BIT higher than the original number :( \n Better luck, next time! ");
                System.out.println("Try guessing the number again :- ");
                g=sc.nextInt();
                guess=g;
            }
            else if(guess<n)
            {
                d=n-guess;
                if(d>2)
                    System.out.println("Uh-oh! WRONG GUESS \n Your guess is MUCH lower than the original number :( \n Better luck, next time! ");
                else 
                    System.out.println("Uh-oh! WRONG GUESS \n Your guess is a BIT lower than the original number :( \n Better luck, next time! ");
                System.out.println("Try guessing the number again :- ");
                g=sc.nextInt();
                guess=g;
            }
        }
    }
}