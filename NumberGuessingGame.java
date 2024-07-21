import java.util.Scanner;

class NumberGuessingGame{
    public static void main(String args[])
{
    try (Scanner sc = new Scanner(System.in)) {
        int number = 1 + (int)(100* Math.random());
        int n = 5;
        int i, guess;
        System.out.println( "A number is choosen between 1 to 100. Guess the number within 5 trials.");
        System.out.println("Guess the number:");
        for (i = 0; i < n; i++) {
            System.out.println("Trial-"+(i+1));
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.\n Your a Genius!!!!");
                break;
            }
            else if (number > guess && i != n - 1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i != n - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == n) {
            System.out.println("Ohh No!!\n Your Trails are completed,\n Better Luck Next Time");

            System.out.println("The number is " + number);
        }
    }
}
}