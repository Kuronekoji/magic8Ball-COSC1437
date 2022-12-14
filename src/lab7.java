/**
 * This is lab 7 Magic 8 Ball
 * @author Scylla
 * @date 10/18/2022
 */

import java.util.Scanner;


public class lab7
{

    static String[] ballResponses = {"Not on your life.", "Clearly NO.", "Ask me later.",
                              "Absolutely!", "Murky, the future is.", "A resounding YES.",
                            "No idea. You decide.", "Sound OK to me."};

    
    
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        boolean status = true;

        do 
        {
            System.out.println("What is your question for the all knowing Magic 8 Ball?");
            kbd.nextLine();

            System.out.println();
            System.out.println("The Magic 8 ball says...");
            System.out.println(randomResponse());
            System.out.println();

            status = replay(kbd);

        } while (status == true);

        kbd.close();
    }


    public static String randomResponse()
    {
        int rndChoice = (int)(Math.random() * ballResponses.length);

        return ballResponses[rndChoice];
    }

    public static boolean replay(Scanner kbd)
    {
        boolean retVal = false;
        boolean repeat = false;

        do 
        {
            System.out.print("Would you like to know the future again? y/n: ");
            String temp = kbd.nextLine();
            repeat = false;

            switch (temp)
            {
                case "y":
                retVal = true;
                break;

                case "n":
                retVal = false;
                break;

                default:
                System.out.println("Valid answers are y/n.");
                repeat = true;
                break;
            }
        } while (repeat);

        return retVal;
    }
    
}
