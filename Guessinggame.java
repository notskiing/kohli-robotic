import java.util.Scanner;

class Guessinggame {
    public static void main(String[] args){
        int tries = 3;
        int randomNumber = (int)Math.floor(Math.random()*10+1);
        int guess = 0;
        Scanner myObj = new Scanner(System.in);
        while (tries > 0){
            System.out.println("Please guess a number between 1 and 10");
            guess = myObj.nextInt();
            if (guess == randomNumber){
                System.out.println("that is the right number; you got it with " + tries + " tries left!");
            }
            else {
                tries -= 1;
                System.out.println("Wrong lol you have " + tries + " tries left");
            }
            if (tries == 0){
                System.out.println("ahh you ran out of tries. the correct number was " + randomNumber);
            }
        }
    }
}